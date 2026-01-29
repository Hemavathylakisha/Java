package Java8;
class Person{
	String name;
	Bike b;
	public Person(String name,Bike b) {
		super();
		this.name=name;
		this.b=b;
	}
	public String getName() {
		return name;
	}
	public Bike getB() {
		return b;
	}
	public String getBikeName(Bike b) {
		Person p1=p;
	}
	
}
class Bike{
	String bikename;

	public Bike(String bikename) {
		super();
		this.bikename = bikename;
	}
	
	public String getBikename() {
		return bikename;
	}
}
public class OptionalClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person joyal=new Person("Joyal",new Bike("KTM"));
		System.out.println(joyal.getBikeName(joyal));

		Person k7=new Person("k7",null);
		System.out.println(joyal.getBikeName(k7));
	}

}
