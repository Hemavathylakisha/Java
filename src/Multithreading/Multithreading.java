package Multithreading;
//class ThreadDemo extends Thread{   // creating thread by extending Thread
//public void run() {
//	System.out.println("task-1");
//}
//}
class ThreadDemo implements Runnable{   // creating thread by implements Runnable interface
public void run() {
	for(int i=0; i<5; i++) {
		try {
			Thread.sleep(1000); 
		}catch(InterruptedException e) {
			System.out.println("Interrupted thread");
		}
	System.out.println("task-1");
	}
}
}
class ThreadDemo1 implements Runnable{   // creating thread by implements Runnable interface
public void run() {
	for(int i=0; i<5; i++) {
	System.out.println("task-2");
	}
}
}
public class Multithreading {

public static void main(String[] args) {
	// TODO Auto-generated method stub
	ThreadDemo td=new ThreadDemo();
	ThreadDemo1 td1=new ThreadDemo1();
	Thread t1=new Thread(td);
	Thread t2=new Thread(td1);
	t2.setPriority(Thread.MAX_PRIORITY);
	t1.setPriority(Thread.MIN_PRIORITY);
	t1.start();
	t1.setName("task1");
	t2.start();
	
	 System.out.println("T1 Priority = " + t1.getPriority());
	 System.out.println("T1 Name = " + t1.getName());
     System.out.println("T2 Priority = " + t2.getPriority());
     System.out.println(Thread.currentThread());
     System.out.println(t1.isAlive());
     
	 // Wait for t2 to complete
    try {
        t1.join();
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

    System.out.println("Main thread finished");
}

}
