package Abstraction;

abstract class Animal {
    abstract void sound(); // abstract method (hidden implementation)

    void sleep() { // concrete method
        System.out.println("Animal is sleeping");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Animal a = new Dog();  // upcasting
	        a.sound();
	        a.sleep();
	}

}
