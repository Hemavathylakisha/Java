package Generic;

public class MethodGeneric {
	public static <T> void show(T value) {
		System.out.println(value);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			MethodGeneric.show(100);
			MethodGeneric.show("Java");
			MethodGeneric.show(10.2);
	}

}
