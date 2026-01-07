package Tasks;
class Student{
	String name;
	int age;
	String address;
	Student(String name, int age, String address){
		this.name = name;
		this.age = age;
		this.address = address;
}
	//@override
	public boolean equals(Object obj) {
		Student check=(Student) obj;
		if((this.name.equals(check.name))&& (this.age==check.age) && (this.address.equals(check.address))) {
			return true;
		}
			return false;		
	}
}
public class Checkequality {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student user1=new Student("Hema",30,"abc");
		Student user2=new Student("Hema",30,"abc");
		System.out.println(user1.equals(user2));
	}

}
