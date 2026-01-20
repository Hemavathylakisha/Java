package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class classmethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=new ArrayList<>(Arrays.asList(10,30,40,70));
		List<String> li=new ArrayList<>(Arrays.asList("one","two","three","four","four"));
		
		//sort()
		Collections.sort(li);
		System.out.println(li);
		
		//reverse
		Collections.reverse(li);
		System.out.println(li);
		
		//shuffle - especially for gaming,cards
		Collections.shuffle(li);
		System.out.print(li);
		
		//binarysearch - list must be sorted
		Collections.sort(li);
		System.out.println(li);
		int index=Collections.binarySearch(li, "two");
		System.out.println("Binary search " + index);
		 
		//max()
        System.out.println("Max element: " + Collections.max(li));

        //min()
        System.out.println("Min element: " + Collections.min(li));
        
        //frequency()
        System.out.println("Frequency: " + Collections.frequency(li, "four"));
        
        //replaceAll()
        System.out.println(Collections.replaceAll(li, "two", "Two")); //return boolean value
        System.out.println(li);
        
        //synchronizedList and synchronizedMap - should manually synchronized map while iterate
        List<Integer> syncList =
        	    Collections.synchronizedList(new ArrayList<>());
        Map<Integer, String> map =
        	    Collections.synchronizedMap(new HashMap<>());
        
        //Immutable Collections (Unmodifiable)
        //unmodifiableList()
        List<String> unmod = Collections.unmodifiableList(li); //prevent accidental modification, read only API, security
        //unmod.add("X"); // ❌ UnsupportedOperationException
        
        //reverseOrder()
        Collections.sort(li, Collections.reverseOrder());
        System.out.println(li);
        
        //emptyList(), emptySet(), emptyMap()
        List<String> empty = Collections.emptyList();
        System.out.println(empty);
        
        //singletonList()
        List<String> single = Collections.singletonList("Java"); //immutable, exactly one element
        System.out.println(single);
        
      //fill()
        Collections.fill(list, 5);
        System.out.println("After fill(5): " + list);
        
     // copy()
        List<Integer> source = Arrays.asList(1, 2, 3, 4);
        List<Integer> destination = new ArrayList<>(Arrays.asList(0, 0, 0, 0));

        Collections.copy(destination, source);
        System.out.println("After copy(): " + destination);
	}

}
