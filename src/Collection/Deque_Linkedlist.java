package Collection;
import java.util.LinkedList;
import java.util.Deque;

public class Deque_Linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Queue operations - FiFo
		Deque<Integer> ob=new LinkedList<>();
//		ob.add(null); //allow only on linked list
//		ob.addFirst(20); 
//		ob.add(30); //allow duplicates
//		ob.add(30);
//		
//		ob.remove();
//		ob.removeFirst();
//		ob.offer(60);
//		ob.offerFirst(70);
//		ob.pollFirst();
//		ob.poll();
//		System.out.println(ob);
//		System.out.println(ob.getFirst());
//		System.out.println(ob.peekFirst());
//		System.out.println(ob);
		
		//Stack operations - LIFO - not use isEmpty and search method
		ob.push(100);
		ob.push(30);
		ob.push(40);
		ob.pop();
		System.out.println(ob.peek());
		
	}

}
