package Set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

class Employee implements Comparable<Employee>{
	private int id;
	private String name;
	private double salary;
	private int age;
	
	Employee(int id,String name,double salary,int age){
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.age=age;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Employee ob) {
		// TODO Auto-generated method stub
//		if(this.id>ob.id) return 1;  //way1
//		else return -1;
		//return this.id-ob.id;  //way2
		return Integer.valueOf(id).compareTo(Integer.valueOf(ob.id)); //way3
		
	}
	
}   
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
class Idsort implements Comparator<ShopMembers>{
	
	@Override
	public int compare(ShopMembers ob1, ShopMembers ob2) {
		if(ob1.getId()>ob2.getId()) return 1; //way1
		else return -1;
	}

	
}
class Namesort implements Comparator<ShopMembers>{
	
	@Override
	public int compare(ShopMembers ob1, ShopMembers ob2) {
		return ob1.getName().compareTo(ob2.getName());
	}
	
}
class Agesort implements Comparator<ShopMembers>{
	
	@Override
	public int compare(ShopMembers ob1, ShopMembers ob2) {
		return ob1.getAge()-ob2.getAge();
	}
	
}
class Salarysort implements Comparator<ShopMembers>{
	
	@Override
	public int compare(ShopMembers ob1, ShopMembers ob2) {
		if(ob1.getSalary()>ob2.getSalary()) return 1; //way1
		else return -1;
	}
	
}
public class TreeSetdemo{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Heterogeneous not allow in tree set
		 TreeSet<Integer> set = new TreeSet<>();

	        set.add(40);
	        set.add(10);
	        set.add(30);
	        set.add(20);
	        set.add(10); // duplicate ignored

	        System.out.println(set); //display in ascending order default
	        
	        System.out.println("-----------------Tree set methods----------");
	        TreeSet<String> set1 = new TreeSet<>();
	        set1.add("Banana");
	        set1.add("Apple");
	        set1.add("Mango");

	        System.out.println(set1);
	            
	            set.add(10);
	            set.add(20);
	            set.add(30);
	            set.add(40);
	            set.add(50);

	            System.out.println("Set: " + set);

	            System.out.println("First: " + set.first());
	            System.out.println("Last: " + set.last());

	            System.out.println("Lower than 30: " + set.lower(30));
	            System.out.println("Higher than 30: " + set.higher(30));

	            System.out.println("Floor of 25: " + set.floor(25));
	            System.out.println("Ceiling of 25: " + set.ceiling(25));

	            System.out.println("Poll First: " + set.pollFirst());
	            System.out.println("Poll Last: " + set.pollLast());

	            System.out.println("After polling: " + set);

	            System.out.println("HeadSet(<30): " + set.headSet(30));
	            System.out.println("TailSet(30): " + set.tailSet(30));
	            System.out.println("SubSet(20,40): " + set.subSet(20, 40));
	            
	            System.out.println("\n"); 
	            
	            //Used for Comparable
	            System.out.println("-----------------Comparable Interface used for SingleSort----------");
	            List<Employee> empset = new ArrayList<Employee>(
		        		Arrays.asList(
		        				new Employee(102,"name2",20000.00,26),
		        				new Employee(104,"name4",22000.00,27),
		        				new Employee(101,"name1",24000.00,24),
		        				new Employee(105,"name5",26000.00,23),
		        				new Employee(103,"name3",28000.00,22)
	    	            ));
	            System.out.println("----------Before Sorting------------------");
	            System.out.println(empset);
	            Collections.sort(empset);
	            System.out.println("-------------After sorting----------------");
	            System.out.println(empset);
	            System.out.println("\n"); 
	            
	            
	            //Used for comparator
	            System.out.println("-----------------Comparator Interface used for MultiSort----------");
//	            List<ShopMembers> shopset = new ArrayList<ShopMembers>(
//		        		Arrays.asList(
//		        				new ShopMembers(102,"Barbie",20000.00,26),
//		        				new ShopMembers(104,"Yoga",22000.00,27),
//		        				new ShopMembers(101,"Sweden",24000.00,24),
//		        				new ShopMembers(105,"Franklin",26000.00,23),
//		        				new ShopMembers(103,"Soba",28000.00,22)
//	    	            ));
	            		
	            	TreeSet<ShopMembers> shopset=new TreeSet<ShopMembers>(new Idsort());	
	            shopset.add(new ShopMembers(102,"Barbie",20000.00,26));
	            shopset.add(new ShopMembers(104,"Yoga",22000.00,27));
	            shopset.add(new ShopMembers(101,"Sweden",24000.00,24));
	            shopset.add(new ShopMembers(105,"Franklin",26000.00,23));
	            shopset.add(new ShopMembers(103,"Soba",28000.00,22));
	            System.out.println(shopset);
//	            //Idsort
//	            System.out.println("---ID Sort---");
//	            Collections.sort(shopset, new Idsort());
//	            System.out.println("After ID Sorting" + shopset);
//	            
//	            //Namesort
//	            System.out.println("---Name Sort---");
//	            Collections.sort(shopset, new Namesort());
//	            System.out.println("After Name Sorting" + shopset);
//	            
//	            //Agesort
//	            System.out.println("---Age Sort---");
//	            Collections.sort(shopset, new Agesort());
//	            System.out.println("After Age Sorting" + shopset);
//	            
//	            //Salarysort
//	            System.out.println("---Salary Sort---");
//	            Collections.sort(shopset, new Salarysort());
//	            System.out.println("After Salary Sorting" + shopset);
	        }
	}


