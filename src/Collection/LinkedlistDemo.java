package Collection;
import java.util.LinkedList;

public class LinkedlistDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> list=new LinkedList<>(); 
		
		list.add(10);
		list.add(20);
		list.addFirst(30);
		list.addLast(60);
		list.add(100);		
		System.out.println("List added:" + list);
		
		list.add(80);
		list.addLast(120);
		System.out.println("After List added:" + list);
		
		list.remove(2);
		list.removeLast();
		list.removeFirst();
		list.add(60);
		System.out.println(list.get(0));
		System.out.println(list.size());
		System.out.println(list.contains(100));
		
		
		LinkedList list1=new LinkedList();
		list1.add(40);
		list1.add("Java");
		list1.add("Welcome");
		System.out.println(list.contains(Integer.valueOf(10)));
		System.out.println(list.lastIndexOf(Integer.valueOf(60)));
		System.out.println("After List data :" + list);
		System.out.println("After List1 data :" + list1);
		
		Object[] arr=list1.toArray();
		System.out.println(list1);
		System.out.println("After List data removed:" + list);
	}
}
