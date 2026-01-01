package Tasks;
import java.util.Scanner;

class TableThread extends Thread {
    int number;

    TableThread(int number) {
        this.number = number;
    }

    public void run() {
        System.out.println("Table of " + number + " printed by " + Thread.currentThread().getName());
        
        for (int i = 1; i <= 10; i++) {
        	
            System.out.println(number + " x " + i + " = " + (number * i));
        }
        System.out.println("--------------------------------------");
    
    }
}
public class UserTable {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int[] input=new int[5];
		
		System.out.println("Enter 5 numbers to print user tables:");
		for(int i=0;i<5;i++) {
			input[i]=sc.nextInt();
		}
		
		TableThread t1 = new TableThread(input[0]);
        TableThread t2 = new TableThread(input[1]);
        TableThread t3 = new TableThread(input[2]);
        TableThread t4 = new TableThread(input[3]);
        TableThread t5 = new TableThread(input[4]);
        
        t1.start();
        t1.join();
        ;
        t2.start();
        t2.join();
        
        t3.start();
        t3.join();
        
        t4.start();
        t4.join();
        
        t5.start();
        t5.join();
	}

}
