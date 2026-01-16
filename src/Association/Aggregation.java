package Association;
class Address {
    String city;
    String state;

    Address(String city, String state) {
        this.city = city;
        this.state = state;
    }
}

class Student {
    String name;
    Address address; // HAS-A relationship

    Student(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("City: " + address.city);
        System.out.println("State: " + address.state);
    }
}

public class Aggregation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Address addr = new Address("Chennai", "Tamil Nadu");

	        Student s = new Student("Hemavathy", addr);

	        s.display();
	}

}
