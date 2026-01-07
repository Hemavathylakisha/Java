package Collections;
import java.util.*;

public class Arraylistmethods {
//Homogeneous and Hetrogenous  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Homogeneous
		ArrayList<Integer> ob=new ArrayList<>();
		ArrayList<Integer> al=new ArrayList<>();
		al.ensureCapacity(50);
		al.add(12);
		al.add(null);
		al.add(10);
		al.add(20);
		al.add(22);
		
		ob.add(20);
		ob.add(50);
		ob.add(60);
		
		al.remove(1);
		al.set(0, 100);
//		al.set(1, 200);
		System.out.println(al.contains(20));
		System.out.println(al);
		System.out.println(al.get(1));
		System.out.println(ob);
		al.addAll(1,ob);
		System.out.println(al);
		al.removeAll(ob);
		System.out.println(al);

		ArrayList<String> sm=new ArrayList<>();
		sm.add("Java");
		sm.add("Hello");
		sm.add("welcome");
		sm.add("language");
		
//		System.out.println(sm);
//		sm.toArray();
		System.out.println(sm);
		//String[] arr=al.toArray();
		System.out.println(al);
		al.clear();
		System.out.println(al);
		
		for(String s:sm) {
			System.out.println(s);
		}
		
		ArrayList<String> copy=(ArrayList<String>)sm.clone();
		
		System.out.println("Original: " + sm);
		System.out.println("Copy: " + copy);
		
		
	}

}
