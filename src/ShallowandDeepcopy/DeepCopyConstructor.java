package ShallowandDeepcopy;

class EmpAddress{
	String city;
	
	EmpAddress(String city){
		this.city=city;
	}
	EmpAddress(EmpAddress addr){
		this.city=addr.city;
	}
}
class Empdata {
	int id;
	EmpAddress address;
	
	Empdata(int id,EmpAddress address){
		this.id=id;
		this.address=new EmpAddress(address);
	}
	
	
}
public class DeepCopyConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmpAddress ad1=new EmpAddress("Chennai");
		Empdata d=new Empdata(1,ad1);
		Empdata d1=new Empdata(d.id,d.address);
		
		d1.address.city="delhi";
		
		System.out.println(d.address.city);
		System.out.println(d1.address.city);
	}

}
