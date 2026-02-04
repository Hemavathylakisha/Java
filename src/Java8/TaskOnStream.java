package Java8;

import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

class SampleEmployee{
	private int id;
	private String name;
	private String department;
	private double salary;
	public SampleEmployee(int id, String name, String department, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getDepartment() {
		return department;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "SampleEmployee [id=" + id + ", name=" + name + ", department=" + department + ", salary=" + salary
				+ "]";
	}
}
public class TaskOnStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<SampleEmployee> employees = List.of(
				new SampleEmployee(1, "Abi", "IT", 70000),
				new SampleEmployee(2, "Rahana", "HR", 45000),
				new SampleEmployee(3, "John", "IT", 60000),
				new SampleEmployee(4, "Mirutun", "Finance", 80000),
				new SampleEmployee(5, "Likitha", "IT", 35000)
				);

		//Q1. Find the highest paid employee from the employee list using Stream API
		Comparator<SampleEmployee> max_emp=new Comparator<SampleEmployee>() {
			@Override
			public int compare(SampleEmployee ob1,SampleEmployee ob2) {
				if(ob1.getSalary()>ob2.getSalary()) return 1; //way1
				else return -1;
			}
		};
		Optional<SampleEmployee> highsalary=employees.stream().max(Comparator.comparing(SampleEmployee::getSalary));
		System.out.println("Highest paid Employee : " + highsalary);
		//		Optional<SampleEmployee> highsalary1=employees.stream().max(max_emp);
		//		System.out.println("Highest paid Employee : " + highsalary1);
		System.out.println("_______________________________________________________________________________________________________________");

		//Q2. Find the second highest salary employee using Stream API

		//SampleEmployee secondHighest=employees.stream().sorted(Comparator.comparing(SampleEmployee::getSalary)).skip(1);
		Comparator<SampleEmployee> maxemp=new Comparator<>()
		{

			@Override
			public int compare(SampleEmployee o1, SampleEmployee o2) {

				return Double.compare(o2.getSalary(), o1.getSalary());
			}

		};

		//Optional<SampleEmployee> secondHighest=employees.stream().sorted(maxemp).skip(1).findFirst();
		Optional<SampleEmployee> secondHighest=employees.stream().sorted(Comparator.comparing(SampleEmployee::getSalary).reversed()).skip(1).findFirst();
		System.out.println("Second Highest salary : " + secondHighest);
		System.out.println("_______________________________________________________________________________________________________________");
		//Q3. Filter all IT department employees and collect them into a list.
		List<SampleEmployee> Itemployees=employees.stream().filter(n->n.getDepartment()=="IT").toList();
		System.out.println("IT Employees: " + Itemployees);
		System.out.println("_______________________________________________________________________________________________________________");
		//Q4. Check whether any employee earns more than 65,000 using Stream API.
		boolean anyAbove65k =employees.stream().anyMatch(e -> e.getSalary() > 65000);
		System.out.println("Above 65k Employees: " + anyAbove65k);
		System.out.println("_______________________________________________________________________________________________________________");
		//Q5. Check whether all employees earn more than 30,000 using Stream API.
		boolean allAbove30k =employees.stream().allMatch(e -> e.getSalary() > 30000);
		System.out.println("Above 30k Employees: " + allAbove30k);
		System.out.println("_______________________________________________________________________________________________________________");
		//Q6. Count the number of employees working in the IT department.
		long itCount =employees.stream().filter(e -> e.getDepartment().equalsIgnoreCase("IT")).count();
		System.out.println("Count of IT Employees: " + itCount);
		System.out.println("_______________________________________________________________________________________________________________");
		//Q7. Find the lowest salary employee using Stream API.
		Comparator<SampleEmployee> minemp=new Comparator<>()
		{

			@Override
			public int compare(SampleEmployee o1, SampleEmployee o2) {

				return Double.compare(o1.getSalary(), o2.getSalary());
			}

		};
		SampleEmployee lowestPaid =employees.stream().min(minemp).orElse(null);
		System.out.println("Lowest paid Employees :" + lowestPaid);
		System.out.println("_______________________________________________________________________________________________________________");
		//Q8. Get the names of employees whose salary is greater than 50,000.
		List<String> highEarners =
				employees.stream()
				.filter(e -> e.getSalary() > 50000)
				.map(SampleEmployee::getName)
				.toList();
		System.out.println("Highest salary Employees: " + highEarners);
		System.out.println("_______________________________________________________________________________________________________________");
		//Q9. Sort the employees by salary in ascending order using Stream API.
		List<SampleEmployee> ascSalary =
				employees.stream()
				.sorted(Comparator.comparing(SampleEmployee::getSalary))
				.toList();
		System.out.println(ascSalary);
		System.out.println("_______________________________________________________________________________________________________________");
		//Q10. Sort the employees by salary in descending order using Stream API.
		List<SampleEmployee> descSalary =
				employees.stream()
				.sorted(Comparator.comparing(SampleEmployee::getSalary).reversed())
				.toList();
		System.out.println(descSalary);
		System.out.println("_______________________________________________________________________________________________________________");
		//Q11. Create a Map where key = employee id, value = employee salary.
		Map<Integer, Double> idSalaryMap =
				employees.stream()
				.collect(Collectors.toMap(
						SampleEmployee::getId,
						SampleEmployee::getSalary
						));
		System.out.println("Salary with respective id : " + idSalaryMap);
		System.out.println("_______________________________________________________________________________________________________________");
		//Q12. After sorting employees by salary, find the first employee.
		SampleEmployee firstAfterSort =
				employees.stream()
				.sorted(Comparator.comparing(SampleEmployee::getSalary))
				.findFirst()
				.orElse(null);
		System.out.println("Sorted by salary based employee : " + idSalaryMap);
		System.out.println("_______________________________________________________________________________________________________________");
		//Q13. Skip the lowest paid employee and find the next employee.
		SampleEmployee secondLowest =
				employees.stream()
				.sorted(Comparator.comparing(SampleEmployee::getSalary))
				.skip(1)
				.findFirst()
				.orElse(null);
		System.out.println("Second lowest salary employee : " + secondLowest);
		System.out.println("_______________________________________________________________________________________________________________");
		//Q14. Use peek() to debug employee salary changes and increase salary by 10%.
		List<SampleEmployee> updatedEmployees =
				employees.stream()
				.peek(e -> System.out.println("Before: " + e))
				.peek(e -> e.setSalary(e.getSalary() * 1.10))
				.peek(e -> System.out.println("After: " + e))
				.toList();

		//Q15. Find the total salary payout of all employees using Stream API.
		BinaryOperator<Double> s1=new BinaryOperator<Double>() {

			@Override
			public Double apply(Double t, Double u) {
				return t+u;
			}
		};
		System.out.println("_______________________________________________________________________________________________________________");
		//Optional<Double> total=	employees.stream().map(n->n.getSalary()).reduce(s1);
		//Optional<Double> totalsalary=employees.stream().map(SampleEmployee::getSalary).reduce((a,b)->a+b);
		Double totalsalary=employees.stream().mapToDouble(SampleEmployee::getSalary).sum();
		System.out.println("No of Employees total Salary: "+ totalsalary);
		System.out.println("_______________________________________________________________________________________________________________");
		
		
		//Return as Queue - get employee names 
		Queue<String> names=employees.stream().map(SampleEmployee::getName).collect(Collectors.toCollection(ArrayDeque::new));
		System.out.println(names);
		System.out.println("_______________________________________________________________________________________________________________");
		//Return as Queue - sort by highest salary in Sample employee
		Queue<SampleEmployee> highpay=employees.stream().collect(Collectors.toCollection(()->new PriorityQueue<>(Comparator.comparing(SampleEmployee::getSalary).reversed())));
		System.out.println(highpay.poll());
		System.out.println("_______________________________________________________________________________________________________________");
		//Return as Queue - sort by lowest salary in Sample employee
		Queue<SampleEmployee> lowpay=employees.stream().collect(Collectors.toCollection(()->new PriorityQueue<>(Comparator.comparing(SampleEmployee::getSalary))));
		System.out.println(lowpay.poll());
		System.out.println("_______________________________________________________________________________________________________________");
		//Return as Queue - sort by salary in descending Sample employee
		Queue<SampleEmployee> descpay=employees.stream().filter(n->n.getDepartment().equalsIgnoreCase("IT")).collect(Collectors.toCollection(()->new PriorityQueue<>(Comparator.comparing(SampleEmployee::getSalary).reversed())));
		//System.out.println(descpay);
		while(!descpay.isEmpty()) {
			System.out.println(descpay.poll());
		}
	}

}
