package Library;

import java.util.ArrayList;
import java.util.List;

public class LibraryApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			
			LibraryService service=new LibraryService();
			
			//for add users
			service.addUser(new User(1, "Hema Lakisha", 22, "Chennai"));
			service.addUser(new User(2, "Ravi Kumar", 25, "Bangalore"));
			service.addUser(new User(3, "Anitha Sharma", 28, "Hyderabad"));
			service.addUser(new User(4, "Suresh Reddy", 30, "Vijayawada"));
			service.addUser(new User(5, "Priya Singh", 24, "Delhi"));
			service.addUser(new User(6, "Arjun Mehta", 27, "Pune"));
			service.addUser(new User(7, "Kavya Nair", 23, "Kochi"));
			service.addUser(new User(8, "Rahul Verma", 29, "Noida"));

			
			//For add books
			service.addBook(new Book(101, "Java Fundamentals", "James Gosling", "Programming", "2010"));
			service.addBook(new Book(102, "Effective Java", "Joshua Bloch", "Programming", "2018"));
			service.addBook(new Book(103, "Clean Code", "Robert Martin", "Programming", "2009"));
			service.addBook(new Book(104, "Data Structures", "Mark Allen", "Computer Science", "2012"));
			service.addBook(new Book(105, "Algorithms", "Robert Sedgewick", "Computer Science", "2011"));

			service.addBook(new Book(106, "Spring in Action", "Craig Walls", "Programming", "2020"));
			service.addBook(new Book(107, "Hibernate Basics", "Gavin King", "Programming", "2016"));
			service.addBook(new Book(108, "Microservices", "Sam Newman", "Architecture", "2019"));
			service.addBook(new Book(109, "Design Patterns", "Erich Gamma", "Architecture", "2005"));
			service.addBook(new Book(110, "System Design", "Alex Xu", "Architecture", "2021"));

			service.addBook(new Book(111, "Operating Systems", "Abraham Silberschatz", "Computer Science", "2014"));
			service.addBook(new Book(112, "Computer Networks", "Andrew Tanenbaum", "Computer Science", "2013"));
			service.addBook(new Book(113, "Database Systems", "Raghu Ramakrishnan", "Database", "2015"));
			service.addBook(new Book(114, "SQL Essentials", "John Patrick", "Database", "2017"));
			service.addBook(new Book(115, "NoSQL Guide", "Pramod Sadalage", "Database", "2019"));

			service.addBook(new Book(116, "Python Basics", "Guido van Rossum", "Programming", "2011"));
			service.addBook(new Book(117, "JavaScript Deep Dive", "Kyle Simpson", "Programming", "2018"));
			service.addBook(new Book(118, "React Explained", "Dan Abramov", "Web Development", "2020"));
			service.addBook(new Book(119, "HTML & CSS", "Jon Duckett", "Web Development", "2014"));
			service.addBook(new Book(120, "Node.js Guide", "Ryan Dahl", "Web Development", "2019"));

			service.addBook(new Book(121, "Cloud Computing", "Rajkumar Buyya", "Cloud", "2016"));
			service.addBook(new Book(122, "AWS Essentials", "Stephane Maarek", "Cloud", "2021"));
			service.addBook(new Book(123, "DevOps Handbook", "Gene Kim", "DevOps", "2017"));
			service.addBook(new Book(124, "Docker in Practice", "Ian Miell", "DevOps", "2018"));
			service.addBook(new Book(125, "Kubernetes Up & Running", "Kelsey Hightower", "DevOps", "2020"));

			service.addBook(new Book(126, "AI Basics", "Stuart Russell", "Artificial Intelligence", "2012"));
			service.addBook(new Book(127, "Machine Learning", "Tom Mitchell", "Artificial Intelligence", "2014"));
			service.addBook(new Book(128, "Deep Learning", "Ian Goodfellow", "Artificial Intelligence", "2016"));
			service.addBook(new Book(129, "Data Science", "Joel Grus", "Data Science", "2019"));
			service.addBook(new Book(130, "Big Data Analytics", "Viktor Mayer", "Data Science", "2018"));

			//For display books
			service.displayavailableBooks();
			service.displayissuedBooks();
			
			//For search book by title
			System.out.println("-----------------------YOUR SEARCHED RESULT BY TITLE--------------------------");
			service.searchBookTitle("Data Science");
			
			System.out.println();
			//For Book Issue 
			service.issueBook(122);
			service.displayavailableBooks();
			service.displayissuedBooks();
			
			System.out.println();
			
			//For Book Request
			service.requestBook(2,111);
			service.requestBook(5, 122);
			
			System.out.println();
			//For Book return
			service.returnBook(122);
			service.displayavailableBooks();
			service.displayissuedBooks();
	}

}
