package Map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeMap;

class ShopMembers{
	private int id;
	private String name;
	private int age;
	private double salary;
	
	ShopMembers(int id,String name,double salary,int age){
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.age=age;
	}
	@Override
	public String toString() {
		return "ShopMembers [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
}

class Idsort implements Comparator<Entry<String,ShopMembers>>{
	
	@Override
	public int compare(Entry<String,ShopMembers> ob1, Entry<String,ShopMembers> ob2) {
//		if(ob1.getId()>ob2.getId()) return 1; //way1
//		else return -1;
		ShopMembers mem1=ob1.getValue();
		ShopMembers mem2=ob2.getValue();
		
		return Integer.compare(mem1.getId(),mem2.getId());
	}	
}
class Namesort implements Comparator<Entry<String,ShopMembers>>{
	
	@Override
	public int compare(Entry<String,ShopMembers> ob1, Entry<String,ShopMembers> ob2) {
		ShopMembers mem1=ob1.getValue();
		ShopMembers mem2=ob2.getValue();
		return mem1.getName().compareTo(mem2.getName());
	}
	
}
class Agesort implements Comparator<Entry<String,ShopMembers>>{
	
	@Override
	public int compare(Entry<String,ShopMembers> ob1, Entry<String,ShopMembers> ob2) {
		ShopMembers mem1=ob1.getValue();
		ShopMembers mem2=ob2.getValue();
		return mem1.getAge()-mem2.getAge();
	}
	
}
class Salarysort implements Comparator<Entry<String,ShopMembers>>{
	
	@Override
	public int compare(Entry<String,ShopMembers> ob1, Entry<String,ShopMembers> ob2) {
		ShopMembers mem1=ob1.getValue();
		ShopMembers mem2=ob2.getValue();
		
		return Double.compare(mem1.getSalary(), mem2.getSalary());
	}
	
}

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
//		  TreeMap map1=new TreeMap();
//	      
//	       map1.put(1, 1);
//	       map1.put(4, 1);
//	       map1.put(2, 1);
//	       map1.put(5, 1);
//	       map1.put(3, 1);
//	       map1.put("hello", 1);
//	       
//	       System.out.println(map1);
	       
	       TreeMap<String,ShopMembers> shopmap=new TreeMap<>();
	       shopmap.put("George", new ShopMembers(102,"George",29000.00,26));
	       shopmap.put("Barbie", new ShopMembers(104,"Barbie",27000.00,22));
	       shopmap.put("Leonie", new ShopMembers(101,"Leonie",23000.00,25));
	       shopmap.put("fraklin", new ShopMembers(105,"fraklin",25000.00,21));
	       shopmap.put("zona", new ShopMembers(106,"zona",21000.00,24));
	       shopmap.put("hello", new ShopMembers(103,"hello",20000.00,27));
	       
	       System.out.println(shopmap);
	       
	      Set<Entry<String,ShopMembers>> entry=shopmap.entrySet();
	      List<Entry<String,ShopMembers>> list=new ArrayList<>(entry);
	      
	      System.out.println("-------------Before Sorting-----------");
	      System.out.println(list);
	      Collections.sort(list,new Idsort());
	      System.out.println("-------------After ID Sorting-----------");
	      System.out.println(list);
	      Collections.sort(list,new Namesort());
	      System.out.println("-------------After Name Sorting-----------");
	      System.out.println(list);
	      Collections.sort(list,new Agesort());
	      System.out.println("-------------After Age Sorting-----------");
	      System.out.println(list);
	      Collections.sort(list,new Salarysort());
	      System.out.println("-------------After Salary Sorting-----------");
	      System.out.println(list);
	}

}
