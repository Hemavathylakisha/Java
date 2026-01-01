package WrapperClass;
import java.util.Scanner;

public class WrapperClassMethods {
//	static void show(Integer a) {
//        System.out.println(a);
//    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//AutoBoxing - primitive -> wrapper object
		int a = 10;
		Integer ob = a;
		System.out.println("Wrapper object:" + ob);	

	
	    // UnBoxing  - Wrapper object -> primitive
//		Integer ob = 20;
//		int a = ob;
//		System.out.println("Primitive value: " + a);
		
		//ValueOf method 
//		Integer i=Integer.valueOf(100);
//		Double d=Double.valueOf(10.3);
//		
//		System.out.println("wrapper Integer value: " + i);
//		System.out.println("wrapper Double value: " + d);
		
		//String -> wrapper -> primitive
//		String s="100";
//		Integer ob=Integer.valueOf(s);
//		int a=ob;
//		
//		System.out.println("String value to integer: " + a);
		
		//Primitive -> string 
//		int a=20;
//		String s=Integer.toString(a);
//		System.out.println("Integer to String value: " + s);
		
		// == and equals() with Wrapper Classes
//		Integer a=100;
//		Integer b=100;
//		
//		Integer x=200;
//		Integer y=200;
//		System.out.println(a==b);
//		System.out.println(a.equals(b));
//		System.out.println(x==y);
//		System.out.println(x.equals(y));
		
		//Integer cache
//		Integer a = 127;
//        Integer b = 127;
//
//        Integer x = 128;
//        Integer y = 128;
//
//        System.out.println(a == b); // true
//        System.out.println(x == y); // false
        
		//utility methods
//        System.out.println(Integer.max(10, 20));
//        System.out.println(Integer.min(10, 20));
//        System.out.println(Integer.parseInt("123"));
//
//        System.out.println(Character.isDigit('5'));
//        System.out.println(Character.isLetter('A'));
//        System.out.println(Character.toUpperCase('a'));
		
		//Boolean values 
//		Boolean b1 = Boolean.valueOf("true");
//        Boolean b2 = Boolean.valueOf("false");
//
//        System.out.println(b1);
//        System.out.println(b2);
		
		
		//user input
//		Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter age: ");
//        String input = sc.nextLine();
//
//        Integer age = Integer.parseInt(input);
//
//        System.out.println("Age after 5 years: " + (age + 5));
		
		
		//Nullpointer 
//		 Integer x = null;
//
//	        // int y = x;  // NullPointerException
//	        System.out.println(x);
	        
		//sum program
//		Integer sum = 0;
//        for (int i = 0; i < 100; i++) {
//            sum += i;  // autoboxing/unboxing happens
//        }
//        System.out.println(sum);
	     
		//wrapper in method 
//		show(10);
}
}