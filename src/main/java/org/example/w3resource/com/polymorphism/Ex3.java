package org.example.w3resource.com.polymorphism;

public class Ex3 {
    //    Write a Java program to create a base class Shape with a method called calculateArea(). Create three subclasses:
//    Circle, Rectangle, and Triangle. Override the calculateArea() method in each subclass to calculate and return
//    the shape's area.
    public static void main(String[] args) {
        Circle circle = new Circle(4);
        System.out.println("Area of Circle: " + circle.calculateArea());

        Rectangle rectangle = new Rectangle(12, 34);
        System.out.println("\nArea of Rectangle: " + rectangle.calculateArea());

        Triangle triangle = new Triangle(5, 9);
        System.out.println("\nArea of Triangle: " + triangle.calculateArea());
    }
}
class Shape{
    public double calculateArea(){
        return 0;
    }
}
class Circle extends Shape{
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI*radius*radius;
    }
}
class Rectangle extends Shape{
    private final int side1;
    private final int side2;

    public Rectangle(int side1, int side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public double calculateArea() {
        return side1*side2;
    }
}
class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height; // Calculate area of triangle
    }
}