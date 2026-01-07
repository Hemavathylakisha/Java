package Generic;

//Class level generic
public class GenericConcept <T> {
	T value;
	void set(T value){
		this.value=value;
	}
	T get() {
		return value;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			GenericConcept ob=new GenericConcept();
			ob.set(10);
			System.out.println(ob.get());
}
}
