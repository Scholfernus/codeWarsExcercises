package org.example.w3resource.com.inheritance.exercises;

public class Ex3 {
    //    Write a Java program to create a class called Shape with a method called getArea(). Create a subclass called
//    Rectangle that overrides the getArea() method to calculate the area of a rectangle.
    public static void main(String[] args) {
        Shape shape = new Shape();
        double area1 = shape.getArea();
        Rectangle rectangle = new Rectangle(3.0, 2.8);
        double area = rectangle.getArea();
        System.out.println(area);
        System.out.println(area1);
    }
}

class Shape {
    public double getArea() {
        return 0.0;
    }
}

class Rectangle extends Shape {
    private final double length;
    private final double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }
}