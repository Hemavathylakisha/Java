package Tasks;
class UpdateandSquare implements Runnable{
	static int[] arr=new int[25];
	static int setindex=0;
	static int squareindex=0;
	static int number=1;
	
	public void run() {
		updateValues();
		squareValues();
	}
		static synchronized void updateValues() { 
			System.out.println(Thread.currentThread().getName() + " update values: ");
			for(int i=0;i<5;i++) {
				if(setindex<25) {
					arr[setindex]=number;
					number++;
					setindex++;
				}
			}
		}	
		static synchronized void squareValues() { 
			System.out.println(Thread.currentThread().getName() + " square values : ");
			for(int i=0;i<5;i++) {
				if(squareindex<20) {
					arr[squareindex]=arr[squareindex]* arr[squareindex];
					squareindex++;
				}
			}	
		}
	}	


public class ArrayTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1=new Thread(new UpdateandSquare(),"Thread-1");
		Thread t2=new Thread(new UpdateandSquare(),"Thread-2");
		Thread t3=new Thread(new UpdateandSquare(),"Thread-3");
		Thread t4=new Thread(new UpdateandSquare(),"Thread-4");

		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
		try {
			t1.join();
			t2.join();
			t3.join();
			t4.join();
		}catch(Exception e) {}
		
		System.out.println("Final Array list: ");
		for(int x: UpdateandSquare.arr) {
			System.out.println(x + " ");
		}
		
}
}