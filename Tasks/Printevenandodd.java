package Tasks;
class Even extends Thread{
	int[] arr;
	Even(int[] arr){
		this.arr=arr;
	}
	public void run() {
		
		for(int num:arr) {
			if(num%2==0) {
				System.out.println("Even numbers: "+ num);
			}
		}
		System.out.println("----------------------------------");
	}
}
class Odd extends Thread{
	int[] arr;
	Odd(int[] arr){
		this.arr=arr;
	}
	public void run() {		
		for(int num:arr) {
			if(num%2!=0) {
				System.out.println("Odd numbers: "+ num);
			}
		}
		System.out.println("----------------------------------");
	}
}
public class Printevenandodd {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		int[] numbers= {21,30,23,43,46,76,55,31,11,10};
//		Even evenThread=new Even();
//		Odd oddThread=new Odd();
//		evenThread.start();
//		//oddThread.start();
		Odd oddnum=new Odd(numbers);
		Even evennum=new Even(numbers);
		oddnum.start();
		oddnum.join();
		evennum.start();
		evennum.join();
	}

}
