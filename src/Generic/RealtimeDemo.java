package Generic;
import java.util.ArrayList;
import java.util.List;

class Electronics{
	
}
class Consumer extends Electronics{
	
}
class Computing extends Electronics{
	
}
class Mobile extends Consumer{
	String name;
	Mobile(String name){
		this.name=name;
	}
	public String toString() {
		return name;
	}
}
class Smartwatch extends Consumer{
	String name;
	Smartwatch(String name){
		this.name=name;
	}
	public String toString() {
		return name;
	}
}
class Desktop extends Computing{
	String name;
	Desktop(String name){
		this.name=name;
	}
	public String toString() {
		return name;
	}
}
class Laptop extends Computing{
	String name;
	Laptop(String name){
		this.name=name;
	}
	public String toString() {
		return name;
	}
}
public class RealtimeDemo{
	public void displayDetailsConsumer(List<?extends Consumer> list) { //upper bound - accepts only sub classes
		System.out.println("---- Consumer Devices ----");  // Used Read only - not possible write/add 
		for(Consumer e:list) {
			int i=e.getClass().toString().lastIndexOf(".");
			System.out.println(e.getClass().toString().substring(i+1)+"....");
			System.out.println(e);
		}
	}
   public void displayDetailsComputing(List<? super Computing> list) { //lower bound - accepts only parent classes
	   System.out.println("---- Computing Devices ----");
	   list.add(new Computing());
	    list.add(new Desktop("HP"));  //add allowed extends computing
	    list.add(new Laptop("Dell"));  //add allowed extends computing

	    //not possible Read only on Object - possible write only
			for(Object e:list) {
				
//				int i=e.getClass().toString().lastIndexOf(".");
//				System.out.println(e.getClass().toString());
				System.out.println(e);
			}
	}
	public static void main(String[] args) {
		RealtimeDemo obj=new RealtimeDemo();
		
		List<Mobile> a=List.of(new Mobile("Sumsung"),new Mobile("oppo"));  //list.of only on read
		List<Smartwatch> a1=List.of(new Smartwatch("vived"),new Smartwatch("max"));  //trying to add not possible using list.of
			
		obj.displayDetailsConsumer(a);
		obj.displayDetailsConsumer(a1);
		
		List<Computing> clist=new ArrayList<>();
		obj.displayDetailsComputing(clist);
		System.out.println(clist.get(0)); // not possible 
		
		List<Electronics> dlist=new ArrayList<>();
		obj.displayDetailsComputing(dlist);
		System.out.println(dlist.get(0)); // not possible
		
		List<Object> olist=new ArrayList<>();
		obj.displayDetailsComputing(olist);
		System.out.println(olist.get(0)); //Read possible 
	}
}