package PracticePackage;

public class Mykids {
	String name;
	int age;
	public Mykids(String name) {
		this.name=name;
	}
	void Kidsage(int old) {
		age=old;
	}
	public int Getage() {
		System.out.println("Age is:" + age);
		return age;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mykids ob=new Mykids("Seyon");
		Mykids obj=new Mykids("Likitha");
		System.out.println("My son is " + ob.name);
		ob.Kidsage(11);
		ob.Getage();
		System.out.println("My Girl is " + obj.name);
		obj.Kidsage(7);
		obj.Getage();
				
	}

}
