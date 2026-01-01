package Multithreading;
class Online extends Thread{
	public void whatsappchat() {
	for(int i=0;i<10;i++) {
		try {
			Thread.sleep(1000);
			System.out.println("Online");
		}catch(InterruptedException e) {
			System.out.println(e.getMessage());
		}
	}
	}
	public void run() {
		whatsappchat();
	}
	
}
public class Whatsappfordaemonthread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Online ob=new Online();
		ob.setDaemon(true);
		ob.start();
		
		for(int i=0; i<5;i++) {
			try {
				Thread.sleep(1000);
				System.out.println("Welcome");
			}catch(InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
	}

}
