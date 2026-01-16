package Library;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class LibraryService {
	List<Book> availableBooks=new ArrayList<>();
	List<User> users=new ArrayList<>();
	List<Book> issuedBooks=new ArrayList<>();
	
	// FIFO Queue for book requests
	Map<Integer, Queue<BookRequest>> requestMap = new HashMap<>();

	public void addBook(Book book) {
		availableBooks.add(book);
		//System.out.println("Book added successfully...");
	}
	
	public void displayavailableBooks() {
		System.out.println("---- AVAILABLE BOOKS ----");
        if (availableBooks.isEmpty()) {
            System.out.println("No books available");
        }
		for(Book b:availableBooks) {
			System.out.println(b);
			System.out.println("----------------------------------------------------------------------------------------------------------------------------------");
		}
	}
	
	public void displayissuedBooks() {
		System.out.println("---- ISSUED BOOKS ----");
        if (issuedBooks.isEmpty()) {
            System.out.println("No books issued");
        }
		for(Book b:issuedBooks) {
			System.out.println(b);
			System.out.println("----------------------------------------------------------------------------------------------------------------------------------");
		}
	}
	
	public void addUser(User user) {
		users.add(user);
		//System.out.println("User added successfully...");
	}
	
	public void requestBook(int userId, int bookId) {
		Queue<BookRequest> queue =
	            requestMap.computeIfAbsent(bookId, k -> new LinkedList<>());
		// Prevent same user requesting SAME book again
	    for (BookRequest req : queue) {
	        if (req.getUserId() == userId) {
	            System.out.println(
	                "User " + userId + " has already requested Book ID " + bookId
	            );
	            return;
	        }
	    }
        queue.offer(new BookRequest(userId, bookId));
        System.out.println("Request added for Book ID " + bookId +
                " by User ID " + userId);
    }
	
	public void searchBookTitle(String title) {
		boolean found=false;
		for(Book book:availableBooks) {
			if(book.getTitle().equalsIgnoreCase(title)) {
				System.out.println("YES, You found the book");
				System.out.println(book);
				found=true;
			}
		}
		if(!found) {
			System.out.println("Book not found");
		}
	}
	
	public void issueBook(int bookId) {
		for (int i = 0; i < availableBooks.size(); i++) {
            Book book = availableBooks.get(i);

            if (book.getId() == bookId) {
                issuedBooks.add(book);      // add to issued
                availableBooks.remove(i);  // remove from available
                System.out.println("Book issued successfully");
                return;
            }
        }
        System.out.println("Book not available");
	}
	
	public void returnBook(int bookId) {
		for (int i = 0; i < issuedBooks.size(); i++) {
            Book book = issuedBooks.get(i);

            if (book.getId() == bookId) {
            	 issuedBooks.remove(i);
                // If someone is waiting in queue for same book
            	 Queue<BookRequest> queue = requestMap.get(bookId);

                 if (queue != null && !queue.isEmpty()) {
                     BookRequest next = queue.poll();
                     issuedBooks.add(book);

                     System.out.println(
                         "Book automatically issued to User ID: " + next.getUserId()
                     );

                } else {
                    availableBooks.add(book);
                    System.out.println("Book returned to library");
                }
                return;
            }
        }
        System.out.println("Invalid book ID");
	}
}
