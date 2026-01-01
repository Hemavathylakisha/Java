package Encapsulation;
class Student{
	private int id;
	private String name;
	
	public void setId(int id) {
		this.id=id;
	}
	public void setname(String name) {
		this.name=name;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
}
public class EncapsulationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student ob=new Student();
		ob.setId(101);
		ob.setname("Hema");
		
		System.out.println(ob.getId());
		System.out.println(ob.getName());
	}

}
