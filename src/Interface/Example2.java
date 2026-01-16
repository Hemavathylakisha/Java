package Interface;
interface Vehicle {
    void start();  // abstract method
    void stop();
}

class Bike implements Vehicle {
    public void start() {
        System.out.println("Bike starts");
    }
    public void stop() {
        System.out.println("Bike stops");
    }
}

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Vehicle v = new Bike();
	        v.start();
	        v.stop();
	}

}
