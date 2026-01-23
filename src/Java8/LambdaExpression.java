package Java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

class Employee{
	int id;
	String name;
	int salary;
	public Employee() {
	        this.name = "Hema";
	    }
	public Employee(int id) {
		this.id=id;
	}
	public Employee(int id,String name) {
		this.id=id;
		this.name=name;
	}
	public Employee(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	void display() {
        System.out.println("supplier data with default constructor ref : " + name);
    }
}

//Method reference usage
@FunctionalInterface //for static method reference
interface Email {
    void send(String name); //only one abstract method
}
@FunctionalInterface //for instance method reference
interface Phone {
    void msg(String name); //only one abstract method
}

@FunctionalInterface //for Constructor method reference
interface EmployeeData {
	Employee create(int id); //constructor method parameter should same with class constructor
}

//Interface Without Lambda Expression

interface Drawable{  
    public void draw();  
}  
//class Drawimplement implements Drawable {
//	int width=10;
//    public void draw() {
//        System.out.println("Width: "+ width);
//    }
//}
@FunctionalInterface
interface Greeting {
    void sayHello(); //only one abstract method
}
@FunctionalInterface
interface Print {
    void show(String msg); //with one parameter
}
@FunctionalInterface
interface Calculator {
    int add(int a, int b); //with multi parameter 
}

@FunctionalInterface
interface Demo {
    void show();
}

public class LambdaExpression{
	//static method for implement in method reference
	public static void share(String s) { 
		System.out.println(s +"Shared messages sent");
	}
	
	//instance method for implement in method reference
		public void data(String m) { 
			System.out.println(m + "Data updated ");
		}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int width=10;
	    
		 Drawable d=new Drawable() {
			 public void draw() {
			        System.out.println("Width: "+ width);
			    }
		 };
		 d.draw();
		 
		 //Lambda expression with no parameter
		 Greeting g = () -> System.out.println("Hello using Lambda");
	     g.sayHello();
	     
	     //Lambda with single parameter
	     Print p = msg -> System.out.println(msg);
	        p.show("Welcome to Lambda");
	     
	    //Lambda with multi parameter
	      Calculator c = (a, b) -> a + b;
	      System.out.println(c.add(10, 20));
	      
	    //Lambda with return type
	      Calculator c1 = (a, b) -> {
	    	    System.out.println("Adding numbers");
	    	    return a + b;
	    	};
	    	System.out.println(c1.add(100, 30));
	    	
	    //Lambda with predicate- returns boolean	
	      Predicate<Integer> isEven = n -> n % 2 == 0;
	      System.out.println(isEven.test(10)); // true
	      
	      Predicate<String> predicate2=(uname)->(uname.contains("sv"))?true:false;
		  System.out.println(predicate2.test("velavan"));
	      
	    //Lambda with Function- returns output
	      Function<String, Integer> length = s -> s.length();
	        System.out.println(length.apply("Java"));
	        
	   //Lambda with consumer interface - no return
	        Consumer<String> printer = s -> System.out.println(s);
	        printer.accept("Hello Consumer");
	        
	   //Lambda with supplier interface - no input return values
	        Supplier<Double> random = () -> Math.random();
	        System.out.println(random.get());
	        
	   //Lambda with collections
	        //sorting list
	        List<Integer> list = Arrays.asList(5, 2, 8, 1);

	        Collections.sort(list, (a, b) -> a - b);
	        System.out.println(list);
	   
	    //Lambda with forEach 
	        list.forEach(e -> System.out.println(e));
	        
	     //For method reference
	        list.forEach(System.out::println);
	        
	        //Lambda with runnable - multithreading
	        Runnable r = () -> System.out.println("Thread running");
	        new Thread(r).start();
	        
	       //final variable access
	        int x = 10;
	       // 	x=20;  //compilation error throws while redeclare - restricts final variable in local
	        Runnable r1 = () -> {
	            System.out.println(x);
	        };
	        
	        r1.run();
	        
	        //LAmbda with interview program
	        Demo d1 = () -> System.out.println("Lambda + Functional Interface");
	        d1.show();
	        
	        //LAmbda with custom object
	        List<Employee> elist=new ArrayList<Employee>();
			elist.add(new Employee(101,"henna", 3456789));
			elist.add(new Employee(103,"abi", 9889));
			elist.add(new Employee(108,"liki", 3908789));

			//		Comparator<Employee> com=new Comparator<Employee>() {
			//			
			//			@Override
			//			public int compare(Employee o1, Employee o2) {
			//				return o1.name.compareTo(o2.name);
			//			}
			//		};
			//		Collections.sort(list,com);

			//		Comparator<Employee> com=(Employee o1, Employee o2)->o1.name.compareTo(o2.name);

			Collections.sort(elist,(Employee o1, Employee o2)->o1.name.compareTo(o2.name));

			for(Employee e:elist) {
				System.out.println(e);
			}
			
			//For biconsumer - pass two arguments using map
			Map<Integer,String> map=new HashMap<>();
			
			map.put(1, "one");
			map.put(2, "two");
			map.put(3, "three");
			map.put(4, "four");
			map.put(5, "five");
			
			//anonymous class
			BiConsumer<Integer,String> bi=new BiConsumer<>() {
				public void accept(Integer k, String v) {
					System.out.println(k + " = " + v);
				}
			};
			map.forEach(bi);
			
			//lambda expression - biconsumer interface
			BiConsumer<Integer,String> biconsumer=(k,v) -> System.out.println(k+ " = " + v);
			
			//way1
			for(Map.Entry<Integer,String> entry:map.entrySet()) {
				biconsumer.accept(entry.getKey(),entry.getValue());
			}
			
			//map.forEach(biconsumer); //way2
			
			//chaining biconsumer using andThen()
			BiConsumer<String, String> bc1 =
			        (a, b) -> System.out.println(a + b);

			BiConsumer<String, String> bc2 =
			        (a, b) -> System.out.println(a.toUpperCase() + b.toUpperCase());

			bc1.andThen(bc2).accept("java", "8");
			
			//Method reference - when different method perform same operation we can use method reference
			//static method
			Email mail=LambdaExpression::share;
			mail.send("Mail : ");
			
			//instance method
			LambdaExpression exp=new LambdaExpression();
			Phone ob=exp::data;
			ob.msg("Phone : ");
			
			//constructor reference - one parameter
			EmployeeData e=Employee::new;
			Employee obj=e.create(101);
			System.out.println(obj);
			
			//constructor reference - two parameter
			 BiFunction<Integer, String, Employee> bf =
					 Employee::new;

			 Employee s = bf.apply(101, "Lakisha");
		     System.out.println(s.id + " " + s.name);
		     
		     //constructor reference - function
		     Function<Integer, Employee> f =
		                Employee::new;

		     Employee ee = f.apply(1001);
		        System.out.println(ee.id);
		        
		   //constructor reference using list
		        List<Integer> ids = Arrays.asList(1, 2, 3);

		        List<Employee> emp = new ArrayList<>();

		        ids.forEach(id -> emp.add(new Employee(id))); //lambda expression
		        
		     // Using constructor reference function
		        Function<Integer,Employee> con=Employee::new;
		        
		       ids.forEach(id -> emp.add(con.apply(id))); //constructor reference
		        
		    //Using default constructor reference supplier
		        Supplier<Employee> se=Employee::new;
		        Employee sup_con=se.get();
		        sup_con.display();
	}

}

