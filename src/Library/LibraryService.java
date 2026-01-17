package Library;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class LibraryService {
	List<Book> availableBooks=new ArrayList<>();
	List<User> users=new ArrayList<>();
	List<Book> issuedBooks=new ArrayList<>();
	
	//For Fast search by using map O(1)
	Map<Integer, Book> availableBookMap = new HashMap<>();
	Map<Integer, Book> issuedBookMap = new HashMap<>();
	
	// Search by category using map
	Map<String, Set<Book>> booksByCategory = new HashMap<>();

	// Search by author using map
	Map<String, Set<Book>> booksByAuthor = new HashMap<>();
	
	// FIFO Queue for book requests
	Map<Integer, Queue<BookRequest>> requestMap = new HashMap<>();

	public void addBook(Book book) {
		//availableBooks.add(book); //using list 
		availableBookMap.put(book.getId(), book); //using map
		//System.out.println("Book added successfully...");
		// Category map
		booksByAuthor
	    .computeIfAbsent(book.getAuthor().toLowerCase(), k -> new HashSet<>())
	    .add(book);
		// author map
		booksByCategory
		    .computeIfAbsent(book.getCategory().toLowerCase(), k -> new HashSet<>())
		    .add(book);
	}
	
	//For search by using book id in map
	public void searchBookById(int bookId) {

	    if (availableBookMap.containsKey(bookId)) {
	        System.out.println("Book is AVAILABLE");
	        System.out.println(availableBookMap.get(bookId));
	        return;
	    }

	    if (issuedBookMap.containsKey(bookId)) {
	        System.out.println("Book is ISSUED");
	        System.out.println(issuedBookMap.get(bookId));
	        return;
	    }

	    System.out.println("Book not found");
	}

	public void displayavailableBooks() {
		System.out.println("---- AVAILABLE BOOKS ----");
		// using list display
//        if (availableBooks.isEmpty()) {
//            System.out.println("No books available");
//        }
//		for(Book b:availableBooks) {
//			System.out.println(b);
//			System.out.println("----------------------------------------------------------------------------------------------------------------------------------");
//		}
		//using map 
      if (availableBookMap.isEmpty()) {
      System.out.println("No books available");
      }
		for (Book book : availableBookMap.values()) {
	        System.out.println(book);
	        System.out.println("----------------------------------------------------------------------------------------------------------------------------------");
	    }
	}
	
	public void displayUniqueAvailablebooks() {
		Set<Book> uniqueBooks=new HashSet<>(availableBookMap.values());
		
		System.out.println("---- UNIQUE AVAILABLE BOOKS ----");

	    for (Book book : uniqueBooks) {
	        System.out.println(book);
	        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------");
	    }
	}
	
	public void displayissuedBooks() {
		System.out.println("---- ISSUED BOOKS ----");
		//by using list
//        if (issuedBooks.isEmpty()) {
//            System.out.println("No books issued");
//        }
//		for(Book b:issuedBooks) {
//			System.out.println(b);
//			System.out.println("----------------------------------------------------------------------------------------------------------------------------------");
//		}
		//by using map
		if (issuedBookMap.isEmpty()) {
          System.out.println("No books issued");
      }
		for (Book book : issuedBookMap.values()) {
	        System.out.println(book);
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
	
	//by using list storage
	public void searchBookCategory(String category) {
		boolean found=false;
		for(Book book:availableBooks) {
			if(book.getCategory().equalsIgnoreCase(category)) {
				System.out.println("YES, You found the book " + book.getCategory());
				System.out.println(book);
				found=true;
			}
		}
		if(!found) {
			System.out.println("Book not found");
		}
	}
	
	//by using list storage
	public void searchBookAuthor(String author) {
		boolean found=false;
		for(Book book:availableBooks) {
			if(book.getAuthor().equalsIgnoreCase(author)) {
				System.out.println("YES, You found the book with " + book.getAuthor());
				System.out.println(book);
				found=true;
			}
		}
		if(!found) {
			System.out.println("Book not found");
		}
	}
	
	//by using map search category return set
	public Set<Book> searchByCategory(String category) {
		 Set<Book> cresult = new HashSet<>();

		    for (Book book : booksByCategory.getOrDefault(
		            category.toLowerCase(), Collections.emptySet())) {

		        if (availableBookMap.containsKey(book.getId())) {
		            cresult.add(book);
		        }
		    }
		    return cresult;
	}
	
	//by using map search author return set
	public Set<Book> searchByAuthor(String author) {
		 Set<Book> aresult = new HashSet<>();

		    for (Book book : booksByAuthor.getOrDefault(
		            author.toLowerCase(), Collections.emptySet())) {

		        if (availableBookMap.containsKey(book.getId())) {
		            aresult.add(book);
		        }
		    }
		    return aresult;
	}
	
	public void issueBook(int bookId) {
		
		//by using list
//		for (int i = 0; i < availableBooks.size(); i++) {
//            Book book = availableBooks.get(i);
//
//            if (book.getId() == bookId) {
//                issuedBooks.add(book);      // add to issued
//                availableBooks.remove(i);  // remove from available
//                System.out.println("Book issued successfully");
//                return;
//            }
//        }
//        System.out.println("Book not available");
		
		//by using map 
		Book book = availableBookMap.remove(bookId);

	    if (book != null) {
	        issuedBookMap.put(bookId, book);
	        System.out.println("Book issued successfully");
	    } else {
	        System.out.println("Book not available");
	    }
	}
	
	public void returnBook(int bookId) {
		//by using list
//		for (int i = 0; i < issuedBooks.size(); i++) {
//            Book book = issuedBooks.get(i);
//
//            if (book.getId() == bookId) {
//            	 issuedBooks.remove(i);
//                // If someone is waiting in queue for same book
//            	 Queue<BookRequest> queue = requestMap.get(bookId);
//
//                 if (queue != null && !queue.isEmpty()) {
//                     BookRequest next = queue.poll();
//                     issuedBooks.add(book);
//
//                     System.out.println(
//                         "Book automatically issued to User ID: " + next.getUserId()
//                     );
//
//                } else {
//                    availableBooks.add(book);
//                    System.out.println("Book returned to library");
//                }
//                return;
//            }
//        }
//        System.out.println("Invalid book ID");
		
		//by using map
	    Book book = issuedBookMap.remove(bookId); //Remove book from issued books

	    if (book == null) {
	        System.out.println("Invalid book ID");
	        return;
	    }

	    Queue<BookRequest> queue = requestMap.get(bookId); //Check if request queue exists for this book

	    if (queue != null && !queue.isEmpty()) { //If queue has waiting users

	        BookRequest nextRequest = queue.poll();
	        issuedBookMap.put(bookId, book);

	        System.out.println(
	            "Book automatically issued to User ID: " + nextRequest.getUserId()
	        );

	        // Optional cleanup
	        if (queue.isEmpty()) {
	            requestMap.remove(bookId);
	        }

	    } else {      
	        availableBookMap.put(bookId, book); // No request → add back to available books
	        System.out.println("Book returned to library");
	    }
	}
}
