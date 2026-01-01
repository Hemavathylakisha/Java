package Collections;
import java.util.ArrayDeque;
import java.util.Deque;

public class Deque_Arraydeque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Queue operations - FIFO
		Deque<Integer> dq=new ArrayDeque<>();
		//dq.add(null); //not allow null values
		dq.add(20);
		dq.offer(100);
		dq.addFirst(200);
		
		dq.offerFirst(20); 
		dq.add(30); //allow duplicates
		dq.add(30);
		
		dq.remove();
		dq.removeFirst();
		dq.offer(60);
		dq.offerFirst(70);
		dq.pollFirst();
		dq.poll();
		System.out.println(dq);
		System.out.println(dq.getFirst());
		System.out.println(dq.peekFirst());
		System.out.println(dq);
		
		System.out.println(dq);
		
		//Stack operations - LIFO isEmpty(), search method not in use
		dq.push(100);
		dq.push(80);
		dq.push(40);
		dq.pop();
		System.out.println(dq);
		System.out.println(dq.peek());
	}

}
