package Tasks;
class Daemontask implements Runnable{
	int start;
	int end;
	Daemontask(int start,int end){
		this.start=start;
		this.end=end;
	}
	public void run() {
		for(int i=start; i<=end;i++) {
			System.out.println(Thread.currentThread().getName()+ " :" + i);
		}
	}
}
public class DaemonThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1=new Thread(new Daemontask(1,200),"NonDaemon Thread");
		Thread t2=new Thread(new Daemontask(201,400),"NonDaemon Thread");
		Thread t3=new Thread(new Daemontask(600,800),"Daemon Thread");
		Thread t4=new Thread(new Daemontask(801,1000),"Daemon Thread");
		t3.setDaemon(true);
		t4.setDaemon(true);
		t3.setPriority(10);
		t4.setPriority(9);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}

}
