package Exceptionhandling;
class WAnimal {
	void hunting() {
		System.out.println("Eats all type of wild animals");
	}
}
class DAnimal extends WAnimal{
	void hunting() {
		System.out.println("Hunting food provided stuff");
	}
}
public class CastingExceptionwithouthandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WAnimal wa=new WAnimal();      //This concept for without throws exception handle the exception using instanceof
		
//		DAnimal da=(DAnimal) wa;	//downcasting exception rises class cast 
//		da.hunting();
		if(wa instanceof DAnimal) {
		DAnimal da=(DAnimal) wa;	
		da.hunting();
		}else {
			System.out.println("throws exception");
		}
	}

}
