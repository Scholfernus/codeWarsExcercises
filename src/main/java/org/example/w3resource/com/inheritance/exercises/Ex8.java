package org.example.w3resource.com.inheritance.exercises;

public class Ex8 {
    //    Write a Java program to create a class called Shape with methods called getPerimeter() and getArea().
//    Create a subclass called Circle that overrides the getPerimeter() and getArea() methods to calculate
//    the area and perimeter of a circle.
    public static void main(String[] args) {
        Circle circle = new Circle(2.5);
        double area = circle.getArea();
        double perimeter = circle.getPerimeter();
        System.out.println(area);
        System.out.println(perimeter);
    }
}

class Shape2 {
    public double getPerimeter() {
        return 0.0;
    }

    public double getArea() {
        return 0.0;
    }
}

class Circle extends Shape2 {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius         ;
    }

    @Override
    public double getArea() {
        return Math.PI * (Math.pow(radius, 2));
    }
}
