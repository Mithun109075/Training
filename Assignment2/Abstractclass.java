package Assignment2;
abstract class Shape {
    abstract void display();   // abstract method
}

class Circle extends Shape {
    void display() {
        System.out.println("This is a Circle");
    }
}

public class Abstractclass {
    public static void main(String[] args) {
        Circle c = new Circle();  // object creation
        c.display();              // method call
    }
}
