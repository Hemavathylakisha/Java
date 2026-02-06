package Java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

class Studentdata{
	int id;
	String name;
	String dept;
	Double salary;
	public Studentdata(int id, String name, String dept,Double salary) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.salary=salary;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getDept() {
		return dept;
	}
	public Double getSalary() {
		return salary;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", dept=" + dept + ", salary=" + salary +"]";
	}
}
public class StreamplaywithStudentdata {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Studentdata> students=Arrays.asList(
				new Studentdata(101,"ram","IT",30000.00),
				new Studentdata(102,"ajith","CSC",32000.00),
				new Studentdata(103,"appu","IT",34000.00),
				new Studentdata(104,"k7","CSC",36000.00),
				new Studentdata(105,"kumar","EEE",40000.00)
				);
		
		//Groupingby and counting
		Map<String,Long> m1=students.stream()
				.collect(Collectors.groupingBy((Studentdata::getDept),Collectors.counting()));
		System.out.println(m1);
		
		//Group & Sum Salaries
		Map<String,Double> gs=students.stream().collect(Collectors.groupingBy((Studentdata::getDept),Collectors.summingDouble(Studentdata::getSalary)));
		System.out.println(gs);
		
		//Group & Max Salary Employee
		Map<String,Optional<Studentdata>> maxSalary=students.stream().collect(Collectors.groupingBy((Studentdata::getDept),Collectors.maxBy(Comparator.comparing(Studentdata::getSalary))));
		System.out.println(maxSalary);
		
		
		//parallel stream - when we process large amount of data processing, parallel stream play with multiple threading 
		students.parallelStream().forEach(System.out::println);
		
		//concurrentgrouping - thread safe in parallel stream
		Map<String, List<Studentdata>> concurrentMap =
					    students.parallelStream()
					    .collect(Collectors.groupingByConcurrent(Studentdata::getDept));
				System.out.println(concurrentMap);
				
	  //parallel salary sum
		double totalSalary =
					    students.parallelStream()
					             .mapToDouble(Studentdata::getSalary)
					             .sum();
		
		System.out.println(totalSalary);
		
	//parallelstream + grouping in concurrent +salary sum
		Map<String, Double> salaryByDept =
	    students.parallelStream()
        .collect(Collectors.groupingByConcurrent(
            Studentdata::getDept,
            Collectors.summingDouble(Studentdata::getSalary)
        ));
		System.out.println(salaryByDept);
		
		//joining with groupingby dept name on stream
		Map<String,String>  groupbydept=students.stream().collect(Collectors.groupingBy(Studentdata::getDept,Collectors.mapping(Studentdata::getName, Collectors.joining(", "))));
		System.out.println(groupbydept);
		
		//joining with parallelstream data into groupingByConcurrent is the best practice
				Map<String,String>  groupbydeptt=students.parallelStream().collect(Collectors.groupingByConcurrent(Studentdata::getDept,Collectors.mapping(Studentdata::getName, Collectors.joining(", "))));
				System.out.println(groupbydeptt);
				
	}

	}

