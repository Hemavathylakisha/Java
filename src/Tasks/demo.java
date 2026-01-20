package Tasks;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class demo {
	public static void sample() {
		List<Integer> li=new ArrayList<>();
		li.add(10);
		li.add(20);
		
		System.out.println(li);
		List<Integer> link=new LinkedList<>();
		link.add(100);
		link.add(200);
		
		System.out.println(link);
		
		Stack<Integer> s=new Stack<>();
		s.push(20);
		s.push(30);
		s.push(300);
		System.out.println(s.peek());
		
		Vector<Integer> v=new Vector<>();
		v.add(null);
		v.add(200);
		v.add(null);
		System.out.println(v);
		
	}
	public static void demo(List<? extends Serializable> list) {
		for(Object li:list) {
			System.out.println(li);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//sample();
		
		demo(new ArrayList<>());
		demo(new LinkedList<>());
		demo(new Vector<>());
		demo(new Stack<>());
		//demo(new HashSet<>()); //compiletime error
		
		List<String> li=new ArrayList<>();
		li.add("nmae");
		//li.add(100.00);
	}

}
