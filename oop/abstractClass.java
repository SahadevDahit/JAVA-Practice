package oop;

abstract class shape {
    public abstract double area(); 
    public int num=0;
    public void display() {
        System.out.println("This is awesome display");
    }
}

class Circle extends shape {
    final double PI = Math.PI;
    int radius = 2;

    @Override
    public double area() {
        return PI * radius * radius;
    }
}

public class abstractClass {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.display();
        System.out.println("Area of the circle: " + c.area());
    }
}
