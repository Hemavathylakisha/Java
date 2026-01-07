package ShallowandDeepcopy;

class Address{
	String city;
}
class Employee implements Cloneable{
	int id;
	Address address;
	
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
public class ShallowCopyClone {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Address a=new Address();
		a.city="Chennai";
		
		Employee e1=new Employee();
		e1.address= a;
		
		Employee e2=(Employee) e1.clone();
		e2.address.city="Madurai";
		
		System.out.println(e1.address.city);
		System.out.println(e2.address.city);
	}

}
