package Interface;
interface Calculator {
    int add(int a, int b);

    default void show() {
        System.out.println("Default method in interface");
    }

    static void info() {
        System.out.println("Static method in interface");
    }
}

class MyCalculator implements Calculator {
    public int add(int a, int b) {
        return a + b;
    }
}

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c = new MyCalculator();
        System.out.println(c.add(10, 20));
        c.show();
        Calculator.info();
	}

}
