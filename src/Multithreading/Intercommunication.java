package Multithreading;
class Rider{
	public synchronized void getBooking(String name) {
		try {
			wait();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Rider name: " + name + " Booking Success..!" );
	}
	public synchronized void getRide() {
		try {
			Thread.sleep(2000);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
//		notify();
		notifyAll();
	}
}
class RiderThread extends Thread{
	Rider ride;
	String name;
	RiderThread(String name,Rider ride){
		this.name=name;
		this.ride=ride;
	}
	public void run() {
		ride.getBooking(name);
	}
}
class Booking extends Thread{
	Rider ride;
	
	Booking(Rider ride){
		this.ride=ride;
	}
	public void run() {
		ride.getRide();
	}
}

public class Intercommunication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rider obj=new Rider();
		System.out.println("Waiting for Booking");		
		RiderThread r1=new RiderThread("Rider 1",obj);
		RiderThread r2=new RiderThread("Rider 2",obj);
		RiderThread r3=new RiderThread("Rider 3",obj);
		Booking book=new Booking(obj);
		r1.start();
		r2.start();
		r3.start();
		book.start();
	}

}
