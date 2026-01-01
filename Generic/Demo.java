package Generic;
import java.util.ArrayList;

// 1. Cannot Catch Generic Exceptions
//class MyException<T> extends Exception { }

class calci <T extends Number> {// 2. could not use arithmetic operations in generics, so used upper bound
	T a, b;
	
	double add(T a, T b) {
		return a.doubleValue() + b.doubleValue();
	}
}
public class Demo {
	static void printList(ArrayList<?> a) { //wildcard genric - unknown object type
	    for (Object o : a)
	        System.out.println(o);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a=new ArrayList();
		a.add(10);
		a.add("Hello");
		printList(a);
		
		calci c=new calci();
		System.out.println(c.add(10, 20));
		
		//3. No primitive allowed
		//ArrayList<int> list = new ArrayList<>(); //invalid
		//ArrayList<Integer> list = new ArrayList<>(); //valid
		
		//4. Cannot Create Objects of Type Parameter, could not create instances of 
		// T obj = new T(); // Compile-time error 
		
		
		//5. Cannot Create Generic Arrays
		//T[] arr = new T[10];
		//ArrayList<String>[] arr = new ArrayList<String>[5];
		
		//6. Static Members Cannot Use Type Parameter
		// static T obj; // Compile-time error
		
		
	}
	

}
