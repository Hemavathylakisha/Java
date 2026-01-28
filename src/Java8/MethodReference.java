package Java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

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

public class MethodReference {
	final int a=10;
		
	
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
        	//x=20;  //compilation error throws while redeclare - restricts final variable in local
        Runnable r1 = () -> {
            System.out.println(x);
        };
        
        r1.run();
        
      //Method reference - when different method perform same operation we can use method reference
		//static method
		Email mail=MethodReference::share;
		mail.send("Mail : ");
		
		//instance method
		MethodReference exp=new MethodReference();
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
