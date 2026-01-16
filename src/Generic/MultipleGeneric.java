package Generic;
class Multiple <N,A>{
	N name;
	A age;
	Multiple(N name,A age){
		this.name=name;
		this.age=age;
	}
	public void display(){
		System.out.println(name + " " + age);
	}
}
public class MultipleGeneric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multiple<String,Integer> p=new Multiple("Hema",22);
		p.display();
	}

}
