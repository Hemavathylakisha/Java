package Iterator;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Iterator is a interface used to traverse a collection of objects one by one, it will perform operations during iteration 
		// -> Iterator(), ListIterator(), Enumeration
		//Iterator()- traverse a objects only in forward direction, Implements the Iterator interface and extends the itr() object of the class in private modifier
		//Methods - hasNext(),next(),remove().
		//ListIterator() - traverse a objects in both forward and reverse directions, Implements the Iterator interface and extends the Listitr() object of the class in private modifier
		//Methods - hasNext(),next(),remove(),add(),set(),hasPrevious(),previous().
		//Enumeration - used in legacy classes of vector 
		
//		ArrayList<Integer> a=new ArrayList<>(); //Homogeneous type object
//		a.add(10);
//		a.add(20);
//		a.add(30);
//		a.add(40);
		
//		for(int i=0;i<a.size();i++){			
//				System.out.println(a.get(i));			
//		}
//		for(Integer li:a) {
//			System.out.println(li);			
//		}
//		Iterator<Integer> li=a.iterator();
//		while(li.hasNext()) {
//			
//			Integer b=li.next();
//			if(b==10) {
//				li.remove();
//			}
//			System.out.println(li.next());
//		}
		
//		ArrayList ae=new ArrayList(); //Hetrogeneous type object
//		ae.add("Hema");
//		ae.add("A");
//		ae.add(300);
//		ae.add(400);
//		
//		Iterator<Object> it=ae.iterator();
//		while(it.hasNext()) {
//			
//			Object b=it.next();
//			if(b instanceof Integer) {
//				Integer t=(Integer) b;
//				if (t.equals(300)) {
//                    it.remove();   // Safe removal
//                } else {
//                    System.out.println(t);
//                }
//			}
//			else if(b instanceof String) {
//				String s=(String) b;
//				System.out.println(s);
//			}
//			
//			System.out.println(it.next());
//		}
//		System.out.println(ae);
		
		System.out.println("List Iterator");
		ArrayList<Integer> a=new ArrayList<>(); //Homogeneous type object
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		ListIterator<Integer> l=a.listIterator();
		while(l.hasNext()) {
			l.next();
		}
		while(l.hasPrevious()) {
			//System.out.println(l.previous());
			Integer lt=l.previous();
			if(lt==30) {
				l.set(300);
			}
			else if(lt==40) {
				l.add(400);
			}
			else if(lt==10) {
				l.remove();
			}
		}
		System.out.println(a);
		
//		System.out.println("List.of purpose checking"); 
//		//List.of - immutable class with fixed size, constant values, used for read only purpose, safe in thread sharing,no null values
//		List<String> list=List.of("Java","Welcome","hello");
//		list.add("hema");  // throws java.lang.UnsupportedOperationException
//		list.add(null);
//		list.set(0, "new");
//		list.remove(1);
//		System.out.println(list);
		List<String> modifiable =
			    new ArrayList<>(List.of("A","B","C")); //allows operations while use Arraylist
		String[] arr= {"A","B","C"};
		List<String> modifiable2 =
			    new ArrayList<>(Arrays.asList(arr)); //not allow add,remove operations
		modifiable2.set(0, null);
		System.out.println(modifiable2);
		//modifiable.add("hello"); 
		//System.out.println(modifiable);
		
	}

}
