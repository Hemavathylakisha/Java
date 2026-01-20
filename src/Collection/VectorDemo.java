package Collection;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> v = new Vector<>();
		Vector v1 = new Vector();

        v.add(10);
        v.add(20);
        v.add(30);
        v.add(20);   // duplicates allowed
        v.addElement(60);
        v.addElement(80);
        System.out.println(v.size());
        v.remove(0);
        
        v1.addElement("Hello");
        v1.add(v);
        
        v1.contains(v);
        System.out.println(v.capacity());
        System.out.println(v.contains(v1));
        
        System.out.println(v);
        System.out.println("Element at index 1: " + v.get(1));
        System.out.println(v1);
        System.out.println(v1.firstElement());
        System.out.println(v.lastElement());
        System.out.println(v.isEmpty());
        System.out.println(v1.indexOf(v));
        System.out.println(v.elements());
        System.out.println(v1.elements());
	}

}
