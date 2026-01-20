package Collection;
import java.util.Queue;
import java.util.ArrayDeque;

public class Queue_Arraydeque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> q=new ArrayDeque<>();
		q.add(10);
		q.add(20);
		q.add(40);
		q.add(40); 
		q.add(60);
		q.remove();
		q.offer(100);
		//q.add(null);  //doesnot allow null value
		
		System.out.println(q.element());
		
		System.out.println(q.poll());
		System.out.println(q.peek());
		System.out.println(q);
	}

}
