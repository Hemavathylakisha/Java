package Polymorphism;

//Java Example: Run Time Polymorphism
class Vehicle {
public void displayInfo() {
 System.out.println("Some vehicles are there.");
}
}

class Car extends Vehicle {
// Method overriding
@Override
public void displayInfo() {
 System.out.println("I have a Car.");
}
}

class Bike extends Vehicle {
// Method overriding
@Override

public void displayInfo() {
	 //super.displayInfo();
 System.out.println("I have a Bike.");
}
}

public class Runtime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle v1 = new Car(); // Upcasting
		 Vehicle v2 = new Bike(); // Upcasting

		 // Calling the overridden displayInfo() method of Car class
		v1.displayInfo();

		 // Calling the overridden displayInfo() method of Bike class
		 v2.displayInfo();
	}

}
