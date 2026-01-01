package Tasks;
import java.util.Scanner;

class User extends Thread{
	String name;
	int age;
	String city;
	public User(String name, int age, String city) {
		this.name=name;
		this.age=age;
		this.city=city;
	}
	public void run() {
		System.out.println(Thread.currentThread().getName() + " " + " Name: " + name + " " + "Age:" + age + " " + "City:" + city);
	}
}
public class Printuserdata {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0; i<5;i++) {
		Scanner sc=new Scanner(System.in);
		System.out.println("User name:");
		String name=sc.nextLine();
		System.out.println("User age:");
		int age=sc.nextInt();
		sc.nextLine();
		System.out.println("User city:");
		String city=sc.next();

		User t1=new User(name,age,city);
		t1.start();
//		User t2=new User(name,age,city);
//		t2.start();
//		User t3=new User(name,age,city);
//		t3.start();
//		User t4=new User(name,age,city);
//		t4.start();
//		User t5=new User(name,age,city);	
//		t5.start();
	}}

}
