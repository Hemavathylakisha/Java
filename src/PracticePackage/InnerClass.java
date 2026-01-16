package PracticePackage;
class Outer{
  private String msg="Welcome";
  
  class Inner{    //member innerclass
	  void display() {  
		  System.out.println("MemberClass: " + msg);
	  }
  }
}
public class InnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer outer = new Outer();
		Outer.Inner inner= outer.new Inner(); //member inner class 
		inner.display();
	}

}
