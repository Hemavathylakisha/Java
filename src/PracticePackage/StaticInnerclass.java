package PracticePackage;

class Outerr {      //static inner class - for nested, can access only static outer variables 
    static int value = 10;

    static class Inner {
        void display() {
            System.out.println("static inner class: " + value);
        }
    }
}

public class StaticInnerclass {
    public static void main(String[] args) {
        Outerr.Inner inner = new Outerr.Inner();
        inner.display();
    }
}
