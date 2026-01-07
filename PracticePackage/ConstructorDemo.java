package PracticePackage;
class Person{
	String name;
	int age;
	
	Person(String s, int a){ //parameterized constructor
		name=s;
		age=a;
	}
	Person(Person p){  //Copy constructor - takes a existing object value to make copy 
		this.name=p.name;
		this.age=p.age;
	}
}
public class ConstructorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1=new Person("Hema", 35);
		Person p2=new Person(p1);
		System.out.println(p2.name);
		System.out.println(p2.age);
	}

}
