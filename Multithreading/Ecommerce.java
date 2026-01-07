package Multithreading;
class Product{
	String name;
	Product(String name){
		this.name=name;
	}
	public synchronized void getProduct(String name, int quantity) {
		System.out.println("Purchase Products:");
		try {
			wait();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public synchronized void getPacking() {
		try {
			System.out.println("Your product "+ name + " get packing...");
			wait();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public synchronized void Delivered() {
		try {
			Thread.sleep(5000);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		notify(); 
		System.out.println("Prouct Successfully Delievered...! Welcome back"); 
	}
}
class ProductThread extends Thread{
	String name;
	Product items;
	int quantity;
	
	ProductThread(String name,int quantity,Product items){
		this.name=name;
		this.items=items;
	}
	public void run() {
		items.getProduct(name, MAX_PRIORITY);
	}
}
class Packingthread extends Thread{
	Product items;
	Packingthread(Product items){
		this.items=items;
	}
	public void run() {
		items.getPacking();
	}
}
class DeliveredThread extends Thread{
	Product items;
	DeliveredThread(Product items){
		this.items=items;
	}
	public void run() {
		System.out.println("Your product will arrive soon...");
		try {
			Thread.sleep(4000);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		items.Delivered();
	}
}
public class Ecommerce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product list=new Product("Dress");
		ProductThread order1=new ProductThread("Dressl",1,list);
		order1.setPriority(10);
		Packingthread pack=new Packingthread(list);	
		DeliveredThread recieved=new DeliveredThread(list);
		order1.start();
		pack.start();
		recieved.start();
	}

}
