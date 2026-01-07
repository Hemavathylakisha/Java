package Map;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer,Integer> map=new TreeMap<>();
		 map.put(10, 1);
		 map.put(30, 2);
		 map.put(60, 3);
		 map.put(20, null);
		 map.put(50, 4);
		 map.put(30, null);
		 
		 System.out.println(map);
		 System.out.println(map.firstKey());
		 System.out.println(map.lastKey()); 
		 System.out.println(map.lowerKey(30));
		 System.out.println(map.higherKey(30));
		 System.out.println(map.floorKey(50));
		 System.out.println(map.ceilingKey(60));
		 System.out.println(map.headMap(50));
		 System.out.println(map.tailMap(20));
		 System.out.println( map.subMap(10, 30));
		 
		 System.out.println(map.firstEntry());
		 System.out.println(map.lastEntry());
		 System.out.println(map.ceilingEntry(15));
		 System.out.println(map.floorEntry(50));
		 
//		 System.out.println( map.pollFirstEntry());
//		 System.out.println(map);
//		 System.out.println( map.pollLastEntry());
//		 System.out.println(map);
		 
		 NavigableMap<Integer, Integer> m= map.descendingMap(); //return the descending key value pair in map
			
			System.out.println(m);  
		
		Set<Integer> s=map.descendingKeySet();  //returns the set with descending keys in map
		System.out.println(s);
		
		NavigableSet<Integer>  ns= map.navigableKeySet(); //return the set with ascending keys in map
		
		System.out.println(ns);
		
		//1. For each iteration java 7
		System.out.println("-------------1. For each iteration java 7--------------");
		 for( Entry<Integer,Integer> entry:  map.entrySet()) {
			  
			   System.out.println(entry);
		  }
		
		 //2. java 8 iteration
		 System.out.println("-----------------2. java 8 iteration------------------");
		 map.forEach((k,v)->System.out.println("key :"+k+" value :"+v));
		 
		 //3. Iterator method 
		 System.out.println("-------------3. Iterator method--------------------");
		  Iterator<Entry<Integer,Integer>> i=   map.entrySet().iterator();
		  
		  while(i.hasNext()) {
			  System.out.println(i.next());
		  }
		  
		  //Hetrogeneous type creation - exception throws in class cast 
		  TreeMap map1=new TreeMap();
	      
	       map1.put(1, 1);
	       map1.put(4, 1);
	       map1.put(2, 1);
	       map1.put(5, 1);
	       map1.put(3, 1);
	       map1.put("hello", 1);
	       
	       System.out.println(map1);
	}

}
