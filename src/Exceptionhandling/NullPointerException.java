package Exceptionhandling;

public class NullPointerException {
	void method() {
	String s=null;
	int[] arr=null;
	System.out.println(arr.length);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NullPointerException ob=new NullPointerException();
		ob.method();
		
	}

}
