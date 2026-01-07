package Abstraction;
abstract class Shape {
    String color;

    Shape(String color) {
        this.color = color;
    }

    abstract void draw();
}

class Circle extends Shape {
    Circle(String color) {
        super(color);
    }

    void draw() {
        System.out.println("Drawing Circle with color: " + color);
    }
}

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Shape s = new Circle("Red");
	        s.draw();
	}

}
