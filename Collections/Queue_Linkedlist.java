package Collections;
import java.util.Queue;
import java.util.LinkedList;

public class Queue_Linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> q=new LinkedList<>();
		
		q.add(null);
		q.add(10);
		q.add(null);
		q.add(20);
		q.offer(70);
		q.offer(50);
		q.add(90);
		System.out.println(q);
		q.remove();
		//q.clear();
		q.poll();
		System.out.println(q.element());
		System.out.println(q);
		System.out.println(q.peek());
		q.offer(100);
		q.offer(null);
		System.out.println(q);
		System.out.println(q.element());
		
		Queue<String> q1 = new LinkedList<>();

        q1.offer("Java");
        q1.offer("Python");
        q1.offer("C++");

        System.out.println("Queue: " + q1);
        System.out.println("Peek: " + q1.peek());
        System.out.println("Poll: " + q1.poll());
        System.out.println("Queue after poll: " + q1);
	}

}
