package Multithreading;
class DeamonThread extends Thread{
	
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Child thread running...");
		
		try {
			Thread.sleep(1000);
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		}
	}
}
public class MainThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DeamonThread obj=new DeamonThread();
		obj.setDaemon(true);
		obj.start();
		System.out.println(obj.isDaemon());
		
		for(int i=0;i<5;i++) {
			
			try {
				System.out.println("Mainthread is running...");
				Thread.sleep(1000);
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}

}
