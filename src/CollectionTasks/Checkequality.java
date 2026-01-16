package CollectionTasks;
class SStudent{
	String name;
	int age;
	String address;
	SStudent(String name, int age, String address){
		this.name = name;
		this.age = age;
		this.address = address;
}
	//@override
	public boolean equals(Object obj) {
		SStudent check=(SStudent) obj;
		if((this.name.equals(check.name))&& (this.age==check.age) && (this.address.equals(check.address))) {
			return true;
		}
			return false;		
	}
}
public class Checkequality {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SStudent user1=new SStudent("Hema",30,"abc");
		SStudent user2=new SStudent("Hema",30,"abc");
		System.out.println(user1.equals(user2));
	}

}
