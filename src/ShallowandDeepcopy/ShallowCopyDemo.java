package ShallowandDeepcopy;

class Student{
	int id;
	String name;
}
public class ShallowCopyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student();
		s1.id=101;
		s1.name="Java";
		
		Student s2=s1;  //shallow copy
		s2.name="Language";
		
		System.out.println(s1.name);
		System.out.println(s2.name);
	}

}
