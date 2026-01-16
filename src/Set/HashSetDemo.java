package Set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.Spliterator;

class Student{
	int id;
	String name;
	
	Student(int id,String name){
		this.id=id;
		this.name=name;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		
		Student other = (Student) obj;
		return id == other.id ;
	}
}

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> set=new HashSet<>();
		set.add(10);
		set.add(30);
		set.add(20);
		set.add(null);
		set.add(20);
		
		System.out.println(set);
		
		Set<String> set1=new HashSet<>();
		set1.add("Hi");
		set1.add("Welcome");
		set1.add("java");
		set1.add("Hi");
		set1.add("Hello");
		
		System.out.println(set1);
		
		List<String> ldata=new ArrayList<>();
		ldata.add("Hi");
		ldata.add("Welcome");
		ldata.add("java");
		ldata.add("Hi");
		ldata.add("Hello");
		
		Set<String> ob=new HashSet<>(ldata);
		ob.add("Welcome to java");
		ob.add("well");
		
		System.out.println(ob);
		System.out.println(set1);
		
		Set<String> ob1=new HashSet<>(16,0.90f);
		ob1.add("data1");
		ob1.add("data2");
		
		System.out.println(ob1);
		
		Set<Student> data=new HashSet<>();
		Student studentdata1=new Student(101,"person1"); 
		Student studentdata2=new Student(102,"person2");
		Student studentdata3=new Student(102,"person3");
		
		
		System.out.println(studentdata2.equals(studentdata3));
		data.add(studentdata1);
		data.add(studentdata2);
		data.add(studentdata3);
		
		System.out.println(data);
		
		//Common methods
		//addAll
		System.out.println(set1.addAll(ob1));
		Set s=new HashSet(List.of(1,2,3,"data1","sample",5));  //allows hetrogeneous type, can add list of data into set
		Set s1=new HashSet(Set.of(1,2,3,5,6,"hi","hello"));
		s.addAll(ob1);
		System.out.println(s);
		//s1.addAll(ob1);
		System.out.println(s1);
		
		//Remove & removeAll
		s.remove("data1");
		System.out.println(s.removeAll(Set.of(2,3)));
		System.out.println(s);
		
		//retainAll
		System.out.println("RetainAll");
		s1.retainAll(s);
		System.out.println(s);
		System.out.println(s1);
		
		//containsAll
		System.out.println(s.contains(ob1));
		
		System.out.println(set.containsAll(Set.of(1,2)));
		System.out.println(set.size());
		
		//iterator()
		Iterator<Integer> i=set.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		//java 8
		//set.forEach(System.out::println);
		
		//toArray()
		Object[] arr=set.toArray();
		System.out.println("Array convertion");
              for(Object arr1:arr) {
            	  Integer arr2=(Integer)arr1;
            	  System.out.println(arr2);
            	  
              }

		//same hashcode 
		Set<Integer> s3= new HashSet<>(Set.of(1,2,3));
		Set<Integer> s4 = new HashSet<>(Set.of(1,3,2));
		
		System.out.println(s3.hashCode()==s4.hashCode());
		
		//spliterator
//		Spliterator<Integer> sp = set.spliterator();
//		System.out.println(sp);
	}

}
