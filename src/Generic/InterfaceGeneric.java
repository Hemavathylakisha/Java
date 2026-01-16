package Generic;
interface Printer<T> {
  void Printdata(T value);
  T Print(T data);
};

class Printing <T> implements Printer<T>{
	public void Printdata(T value) {
		System.out.println(value);
	}
	public T Print(T data) {
		return data;
	}
}

public class InterfaceGeneric{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  Printer p=new Printing();
	  p.Printdata(100);
	  System.out.println(p.Print(1000));
	  
	  Printer ob=new Printing();
	  ob.Printdata("Java");
	  System.out.println(ob.Print("Hema"));
	}

}
