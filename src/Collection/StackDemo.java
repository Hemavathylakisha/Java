package Collection;
import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Stack<Integer> s = new Stack<>();
		 Stack s1 = new Stack();

	        s.push(10);
	        s.push(20);
	        s.push(30);
	        s1.push("OLd menu");
	        s1.push("Happy world");

	        System.out.println("Stack: " + s);

	        System.out.println("Top element: " + s.peek());

	        s.pop();
	        System.out.println("After pop: " + s);

	        System.out.println("Is empty: " + s.empty());
	        
	        int pos = s.search(10);
	        System.out.println(pos);
	        
	        System.out.println(s1);
	}

}
