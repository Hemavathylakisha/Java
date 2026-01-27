package Java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

class Employeedata{
	String ID;
	String name;
	int age;
	double salary;
	public Employeedata(String iD, String name, int age, double salary) {
		super();
		ID = iD;
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	
}
public class TaskOndefaultandstaticmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Store employee details (Employee ID, Name, Age, Salary) in a collection.
		List<Employeedata> list=new ArrayList<>();
		// Adding employee details
        list.add(new Employeedata("E101" , "Amit", 25, 50000));
        list.add(new Employeedata("E102", "Rahul", 30, 60000));
        list.add(new Employeedata("E103", "Neha", 16, 45000));	
        list.add(new Employeedata("E104", "Sneha", 28, 48000));
        
		//Validate employees using BiPredicate:
		//Age must be 18 or above
		//Name must not be empty
		BiPredicate<Employeedata,Employeedata> isValidate=(a,n)-> a.age>=18 && n.name!=null && !n.name.isEmpty();
		//list.forEach(e-> System.out.println("Validate : " + isValid.test(e, e)));
		
		//Filter eligible employees using Predicate:
		//Salary must be 50,000 or above	
		Predicate<Employeedata> isSalary=s->s.salary >= 50000;
		
		//Apply a 10% salary hike to eligible employees using BiConsumer.
		BiConsumer<Employeedata,Double> applyhike=(s,hike)->s.salary +=s.salary * hike;
		
		// Display employee details using Consumer
        Consumer<Employeedata> display =
                e -> System.out.println(e.ID + " " + e.name + " " + e.salary);      
                
       // List to store eligible employees
        List<Employeedata> eligible = new ArrayList<>();
        
     // Validation & Filtering
        for(Employeedata  e:list) {
        	if(!isValidate.test(e, e)) {
        		System.out.println("Invalid Employee: " + e.name);
                continue;
        	}
        	if(isSalary.test(e)) {
        		applyhike.accept(e, 0.10);
        		eligible.add(e);
        	}
        }
                
        System.out.println("---- Eligible Employees ----");
        eligible.forEach(display);
        
        //Count eligible employee using Supplier
        Supplier<Integer> eligibleCount=()-> eligible.size();
        
        System.out.println("Total Eligible Employees: " + eligibleCount.get());
	}

}
