package Association;
class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    void showBook() {
        System.out.println(title + " by " + author);
    }
}

class Library {
    String libraryName;
    Book[] books;   // Aggregation (Library HAS-A Book)

    Library(String libraryName, Book[] books) {
        this.libraryName = libraryName;
        this.books = books;
    }

    void displayBooks() {
        System.out.println("Library: " + libraryName);
        System.out.println("Books available:");
        for (Book b : books) {
            b.showBook();
        }
    }
}

public class AggregationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Book b1 = new Book("Java Programming", "James Gosling");
	        Book b2 = new Book("Data Structures", "Mark Weiss");
	        Book b3 = new Book("Clean Code", "Robert Martin");

	        Book[] bookList = {b1, b2, b3};

	        Library lib = new Library("City Central Library", bookList);
	        lib.displayBooks();
	}

}
