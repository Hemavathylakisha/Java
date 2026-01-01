package PracticePackage;

class OuterMethod{
	
	void localMethod() {
		int value=10;
		class Inner{          //Method local inner class
			void display() {
			System.out.println("Method local inner class: " + value);
			}
		}
		
		Inner obj=new Inner();
		obj.display();
	}
}
public class Methodlocalinnerclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new OuterMethod().localMethod();
	}

}
