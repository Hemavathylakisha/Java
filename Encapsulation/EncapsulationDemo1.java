package Encapsulation;
class Person{
	private String name;
	Person(String name){
		this.name=name;
	}
	public String getName() {
		return name;
	}
}
class Employee extends Person{
	int id;
	Employee(int id, String name) {
		super(name);
		this.id=id;
	}
	void display() {
        System.out.println("Employee ID   : " + id);
        System.out.println("Employee Name : " + getName());
    }
}
public class EncapsulationDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp=new Employee(1,"hema");
		emp.display();
	}

}
