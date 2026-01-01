package Tasks;
abstract class Employee{
	private int emp_id;
	private String emp_name;
	private int attendance;
	private int performance;
	
	Employee(int emp_id,String emp_name,int attendance,int performance){
	this.emp_id=emp_id;
	this.emp_name=emp_name;
	this.attendance=attendance;
	this.performance=performance;
	}
	
	public String getName() {
		return emp_name;
	}
	public int getAttendance() {
		return attendance;
	}
	public int getPerformance() {
		return performance;
	}
	abstract double calculateSalary();
}
class FulltimeEmployee extends Employee{
	private double baseSalary;
	public FulltimeEmployee(int emp_id,String emp_name,int attendance,int performance,double baseSalary){
		super(emp_id,emp_name,attendance,performance);
		this.baseSalary=baseSalary;
	}
	public double calculateSalary() {
		double attendancebonus= getAttendance() * 100;
		double performancebonus= getPerformance() * 50;
		return baseSalary + attendancebonus + performancebonus;
	}
}
class ParttimeEmployee extends Employee{
	private double hourlyRate;
    private int hoursWorked;
    
    public ParttimeEmployee(int emp_id, String emp_name, int attendance, int performance,
            double hourlyRate, int hoursWorked) {
			super(emp_id, emp_name, attendance, performance);
			this.hourlyRate = hourlyRate;
			this.hoursWorked = hoursWorked;
	}
	public double calculateSalary() {
		double basePay= hourlyRate * hoursWorked;
		double attendancebonus= getAttendance() * 50;
		double performancebonus= getPerformance() * 200;
		return basePay + attendancebonus + performancebonus;
	}
}
public class EmployeePayroll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee[] emp=new Employee[3];
		emp[0] = new FulltimeEmployee(101, "Rahul", 26, 4, 30000);
        emp[1] = new ParttimeEmployee(102, "Anita", 20, 5, 200, 80);
        emp[2] = new FulltimeEmployee(103, "Kiran", 24, 3, 28000);

        System.out.println("Employee Payroll Details\n");

        for (Employee e : emp) {
            System.out.println("Name: " + e.getName());
            System.out.println("Salary: ₹" + e.calculateSalary());
            System.out.println("---------------------------");
        }

	}

}
