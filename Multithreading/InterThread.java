package Multithreading;
class Shop{
	int bag=20;
	synchronized void order(int orderOfcount) {
		if(bag>=orderOfcount) {
			System.out.println("Order successful");
			bag-=orderOfcount;
			System.out.println("remaining bags " + bag);
		}
		else {
			try {
			System.out.println("Waiting....");
			wait();			
			}catch(Exception e) {
				System.out.println("order successful after loading");
				bag-=orderOfcount;
				System.out.println("Remaining bags" + bag);
			}
			
		}
	}
	synchronized void load(int countOfload) {
		bag+=countOfload;
		System.out.println("Bags are loaded successfully");
		System.out.println("available bags " + bag);
		notify();
	}
}

class Shopping extends Thread{
	Shop ob;
	Shopping(Shop ob){
		this.ob=ob;
	}
	public void run() {
		ob.order(10);
	}
}
public class InterThread extends Thread{
	Shop ob;
	InterThread(Shop ob){
		this.ob=ob;
	}
	public void run() {
		ob.load(80);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shop ob=new Shop();
		Shopping obj=new Shopping(ob);
		InterThread obj1=new InterThread(ob);
		obj.start();
		obj.setPriority(MAX_PRIORITY);
		obj1.start();
		
	}

}
