package ShallowandDeepcopy;

class Studentdata implements Cloneable {
	String city;
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
}
class Employeedata implements Cloneable{
	int id;
	Studentdata address;
	public Object clone()  throws CloneNotSupportedException{
		Employeedata emp=(Employeedata) super.clone();
		emp.address=(Studentdata) address.clone();  //deep copy - create new instance with separate memory reference
		return emp;
		}
}
public class DeepCopyclone {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Studentdata s1=new Studentdata();
		s1.city="Chennai";
		
		Employeedata e1=new Employeedata();
		e1.address=s1;
		
	    Employeedata e2 = (Employeedata) e1.clone();
		e2.address.city="pune";
		
		System.out.println(e1.address.city);
		System.out.println(e2.address.city);
		
	}

}
