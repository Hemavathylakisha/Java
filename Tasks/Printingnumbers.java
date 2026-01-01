package Tasks;  
//interthread communication 
class Print{
	int num=1;
	public synchronized void printNum() {
		while(num<=10) {
			System.out.println(Thread.currentThread().getName() + " :" + num++);
		notify();
		try {
		if(num<=10) {
			wait();
		}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		}
	}
}
public class Printingnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Print p=new Print();
		Thread t1=new Thread(()->p.printNum(),"Thread 1");
		Thread t2=new Thread(()->p.printNum(),"Thread 2");
		t1.start();
		t2.start();
	}

}
