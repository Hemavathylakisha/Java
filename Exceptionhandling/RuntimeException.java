package Exceptionhandling;
import java.util.*;

public class RuntimeException {
	static void setAge(int age) {
        if (age < 0)
            throw new IllegalArgumentException("Age cannot be negative");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ArithmeticException
//		try {
//		int[] arr= {10,30,30,50,23,46};
//		arr[7]=10/0;
//		System.out.println(arr);}
//		catch(ArithmeticException e) {
//			System.out.println(e.getMessage());
//		}
		
		//NullpointerException
//		String s = null;
//        System.out.println(s.length());
		
		//ArrayIndexOutOfBoundsException
//		 int[] a = {1, 2, 3};
//	        System.out.println(a[5]);
		
	     //StringIndexOutOfBoundsException
//	     String s = "abc";
//	     System.out.println(s.charAt(5));
		
	     //ClassCastException
//	     Object o = new Integer(6);
//	        String s = (String) o;
		
	     //NumberFormatException  
	     //int x = Integer.parseInt("abc");
	     
		//IllegalArgumentException
	     //setAge(-5);
	    
	    // IndexOutOfBoundsException
//	     List<Integer> list = new ArrayList<>();
//	        list.add(10);
//	        System.out.println(list.get(5));
	    
	      int[] a = new int[-3];
	      System.out.println(a);
	      
	      //SecurityException,ConcurrentModificationException,UnsupportedOperationException,IllegalStateException not try
	}

}
