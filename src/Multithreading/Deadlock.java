package Multithreading;

class One{
	synchronized void method1(Two obj) {
		System.out.println("method1 started");
		obj.method4();
	}
	synchronized void method2() {
		System.out.println("method2 started");
	}
}
class Two{
	synchronized void method3(One ob) {
		System.out.println("method3 started");
		ob.method2();
	}
	synchronized void method4() {
		System.out.println("method4 started");
	}
}
class Childthread extends Thread{
	One ob;
	Two obj;
	Childthread(One ob,Two obj){
		this.ob=ob;
		this.obj=obj;
	}
	public void run() {
		obj.method3(ob);
	}
}
public class Deadlock extends Thread{
	One ob;
	Two obj;
	Deadlock(One ob,Two obj){
		this.ob=ob;
		this.obj=obj;
	}
	public void run() {
		ob.method1(obj);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		One d=new One();
		Two d1=new Two();
		Deadlock t=new Deadlock(d,d1);
		Childthread t1=new Childthread(d,d1);
		t.start();
		t1.start();
	}

}
