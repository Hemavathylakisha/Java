package Tasks;
class Person{
	String name;
	int age;
	String gender;
	Person(String name,int age,String gender){
		this.name=name;
		this.age=age;
		this.gender=gender;
	}
}
class Employeee extends Person{
	int employee_id;
	double salary;
	Employeee(String name,int age,String gender,int employee_id,double salary){
		super(name,age,gender);
		this.employee_id=employee_id;
		this.salary=salary;
	}
	void employeeDetails() {
		System.out.println("ID :" + employee_id + " --> " + "Salary: " + salary);
	}
}
class Manager extends Employeee implements Runnable {
	int teamsize;
	String project;
	Manager(String name,int age,String gender,int employee_id,double salary,int teamsize,String project){
		super(name,age,gender,employee_id,salary);
		this.teamsize=teamsize;
		this.project=project;
	}
	void managerDetails() {
		System.out.println("Team :" + teamsize + " --> " + "Project: " + project);
	}
	public void run() {
		System.out.println("Name: " + name);	
		System.out.println("Age: " + age);
		System.out.println("Gender: " + gender);
		employeeDetails();
		managerDetails();
	}
}
public class PersonData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager ob=new Manager(
				"Hema",30,"female",10,100000.20,100,"Specialwork"
				);
		Thread t=new Thread(ob);
		t.start();
	}
}
