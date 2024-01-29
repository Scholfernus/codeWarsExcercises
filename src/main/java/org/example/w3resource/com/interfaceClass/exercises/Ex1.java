package org.example.w3resource.com.interfaceClass.exercises;

public class Ex1 {
    //    Write a Java program to create an interface Shape with the getArea() method. Create three classes Rectangle,
//    Circle, and Triangle that implement the Shape interface. Implement the getArea() method for each of the three classes.
    public static void main(String[] args) {
        int a = 5;
        int b = 2;
        double radius = 2.5;
    Shape rectangle = new Rectangle(a,b);
    rectangle.getArea();
    Shape circle = new Circle(radius);
    circle.getArea();
        System.out.println(rectangle);
        System.out.println(circle);
    }
}
interface Shape {
    void getArea();
}
class Rectangle implements Shape{
    private int a;
    private int b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void getArea() {
        int area = a * b;
        System.out.println(area);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
class Circle implements Shape{
private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void getArea() {
        double circleArea = 2 * Math.PI * radius;
        System.out.println(circleArea);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
