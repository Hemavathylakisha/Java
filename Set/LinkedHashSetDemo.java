package Set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<String> set=new LinkedHashSet<>();
		//  add() – add elements
        set.add("Apple");
        set.add("Banana");
        set.add("Mango");
        set.add("Apple");   // duplicate ignored
        set.add(null);      // allows one null
        
        System.out.println("After add(): " + set);
        
        //Size()
        System.out.println("Size: " + set.size());
        
     // contains()
        System.out.println("Contains Mango? " + set.contains("Mango"));
        System.out.println("Contains Orange? " + set.contains("Orange"));
        
     // remove()
        set.remove("Banana");
        System.out.println("After remove(Banana): " + set);
     
     // isEmpty()
        System.out.println("Is set empty? " + set.isEmpty());
        
        // iterator()
        System.out.println("Using Iterator:");
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        
     // for-each loop
        System.out.println("Using for-each loop:");
        for (String s : set) {
            System.out.println(s);
        }
        
        //toArray()
        Object[] arr = set.toArray();
        System.out.println("Array elements:");
        for (Object obj : arr) {
        	String s=(String) obj;
            System.out.println(s);
        }
        
     // addAll()
        LinkedHashSet<String> newSet = new LinkedHashSet<>();
        newSet.add("Orange");
        newSet.add("Grapes");

        set.addAll(newSet);
        System.out.println("After addAll(): " + set);
        
     //removeAll()
        set.removeAll(newSet);
        System.out.println("After removeAll(): " + set);
        
     // retainAll()
        LinkedHashSet<String> retainSet = new LinkedHashSet<>();
        retainSet.add("Apple");
        retainSet.add("Guava");

        set.retainAll(retainSet);
        System.out.println("After retainAll(): " + set);

     // clear()
        set.clear();
        System.out.println("After clear(): " + set);
        
        // equals()
        LinkedHashSet<String> set1 = new LinkedHashSet<>();
        LinkedHashSet<String> set2 = new LinkedHashSet<>();

        set1.add("A");
        set2.add("A");

        System.out.println("set1 equals set2? " + set1.equals(set2));
        
     // hashCode()
        System.out.println("HashCode of set1: " + set1.hashCode());
        System.out.println("HashCode of set2: " + set2.hashCode());
        


	}

}
