package PracticePackage;
class Animals{
	public void eat() {
		System.out.println("animals are eating");
	}
}
class Dog extends Animals{
	public void bark() {
		System.out.println("Dogs are barking");
	}
	public void eat() {
		System.out.println("Dog eats well");
	}
}
public class Typecasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Upcasting
		Animals a=new Dog(); //always safe
		a.eat();  //runtimepolymorphism-inheritance
		
		//Downcasting safe
		Dog d=(Dog) a;  //safe casting - due to a reference shares from parent
		d.bark();
		d.eat();
		
		//Downcasting unsafe
		Animals aa=new Animals();
		try {
		Dog dc=(Dog) aa;	//unsafe 
		dc.bark();        //runtime error
		}catch(ClassCastException e){
			System.out.println("error"+ e);
		}
	}
	

}
