package Customer;
import java.util.*;
import Customer.Customer;

@FunctionalInterface
interface CustomerProcess {
    void task(Customer customer);
}

public class CustomerService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		        Scanner sc = new Scanner(System.in);

		        // Queue for FIFO order
		        Queue<Customer> customerQueue = new LinkedList<>();

		        // Map for quick lookup
		        Map<Integer, Customer> customerMap = new HashMap<>();

		        // Lambda Expression implementing Functional Interface
		        CustomerProcess operation = 
		            customer -> System.out.println("Processing Customer: " + customer);

		        int choice;

		        do {
		            System.out.println("\n1. Add Customer");
		            System.out.println("2. View Next Customer");
		            System.out.println("3. Serve Customer");
		            System.out.println("4. Display All Customers");
		            System.out.println("5. Exit");
		            System.out.print("Enter your choice: ");

		            choice = sc.nextInt();

		            switch (choice) {

		                case 1:
		                    System.out.print("Enter Customer ID: ");
		                    int id = sc.nextInt();
		                    sc.nextLine();

		                    System.out.print("Enter Customer Name: ");
		                    String name = sc.nextLine();

		                    System.out.print("Enter Issue Type: ");
		                    String issue = sc.nextLine();

		                    Customer customer = new Customer(id, name, issue);

		                    customerQueue.offer(customer);
		                    customerMap.put(id, customer);

		                    System.out.println("Customer added to queue.");
		                    break;

		                case 2:
		                    Customer nextCustomer = customerQueue.peek();
		                    if (nextCustomer != null) {
		                        operation.task(nextCustomer); // Lambda usage
		                    } else {
		                        System.out.println("No customers in queue.");
		                    }
		                    break;

		                case 3:
		                    Customer servedCustomer = customerQueue.poll();
		                    if (servedCustomer != null) {
		                        customerMap.remove(servedCustomer.getCustomer_id());
		                        System.out.println("Served Customer: " + servedCustomer);
		                    } else {
		                        System.out.println("Queue is empty.");
		                    }
		                    break;

		                case 4:
		                    if (customerQueue.isEmpty()) {
		                        System.out.println("No waiting customers.");
		                    } else {
		                        System.out.println("Waiting Customers:");
		                        customerQueue.forEach(System.out::println); // Method Reference
		                    }
		                    break;

		                case 5:
		                    System.out.println("Exiting system...");
		                    break;

		                default:
		                    System.out.println("Invalid choice!");
		            }

		        } while (choice != 5);

		        sc.close();
		    }
		}

	