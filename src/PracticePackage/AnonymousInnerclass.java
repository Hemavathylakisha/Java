package PracticePackage;
//class Family{
//	void display() {
//		System.out.println("Happy family - Thanks to God");
//	}
//}
interface Family{
	void display();
}
public class AnonymousInnerclass {

	public static void main(String[] args) {  
		// TODO Auto-generated method stub
		Family obj=new Family() {   //Anonymous inner class using class
//			void display() {
//				System.out.println("God will give future");
//			}
			public void display() { //Anonymous inner class using interface
				System.out.println("God will give future");
			}
		};
		obj.display();
	}

}
