package Collections;
import java.util.Queue;
import java.util.PriorityQueue;

public class Queue_Priorityqueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  Queue<Integer> pq = new PriorityQueue<>();

	        pq.add(40);
	        pq.add(10);
	        pq.add(30);
	        pq.add(20);

	        System.out.println("PriorityQueue: " + pq);
	        pq.offer(100);
	        System.out.println("PriorityQueue: " + pq);
	        System.out.println("PriorityQueue size: " + pq.size());
	        while (!pq.isEmpty()) {
	            System.out.println(pq.poll());
	        }
	        pq.offer(100);
	        System.out.println("PriorityQueue: " + pq.peek());
	        System.out.println("PriorityQueue: " + pq);
	       
	        PriorityQueue<String> pq1 = new PriorityQueue<>();

	        pq1.add("Banana");
	        pq1.add("Apple");
	        pq1.add("Orange");

	        while (!pq1.isEmpty()) {
	            System.out.println(pq1.poll());
	        }
	        System.out.println("PriorityQueue: " + pq1.peek());    
	}

}
