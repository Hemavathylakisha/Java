package PracticePackage;
class Student {
	private String name;
	private int age;
		
	//Setter
	public void setName(String s) {
		name=s;	
	}
	public void setAge(int a) {
		age=a;
	}
	//getter
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
}
public class Encapsulation {
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student d=new Student();
		d.setName("Likitha");
		d.setAge(7);
		System.out.println("Student Name is "+ d.getName() + " the age of " + d.getAge());
	}

}
