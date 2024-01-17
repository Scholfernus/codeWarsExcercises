package org.example.w3resource.com.abstractClasses.exercises;

import java.util.Random;

public class Ex2 {
    // Write a Java program to create an abstract class Shape with abstract methods calculateArea() and calculatePerimeter()
// Create subclasses Circle and Triangle that extend the Shape class and implement the respective methods
// to calculate the area and perimeter of each shape.
    public static void main(String[] args) {
        Circle circle = new Circle(2.55);
        circle.calculateArea();
        circle.calculatePerimeter();
        Triangle triangle = new Triangle(3, 5, 6);
        triangle.calculatePerimeter();
        triangle.calculateArea();
        double r = 4.0;
        System.out.println("Radius of the Circle " + r);
        System.out.println("Area of the Circle: " + circle.calculateArea());
        System.out.println("Perimeter of the Circle: " + circle.calculatePerimeter());
        System.out.println("\nSides of the Triangle are: " + 3 + ',' + 5 + ',' + 6);
        System.out.println("Area of the Triangle: " + triangle.calculateArea());
        System.out.println("Perimeter of the Triangle: " + triangle.calculatePerimeter());
    }
}

abstract class Shape {


    abstract double calculateArea();

    abstract double calculatePerimeter();
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

class Triangle extends Shape {
    private int side1;
    private int side2;
    private int side3;

    public Triangle(int side1, int side2, int side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    double calculateArea() {
        double s = (double) (side1 + side2 + side3) / 2; // Semi-perimeter
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    @Override
    double calculatePerimeter() {
        return side1 + side2 + side3;
    }
}