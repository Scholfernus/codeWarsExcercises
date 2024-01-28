package org.example.w3resource.com.objectOrientedProgramming.exercises;

import lombok.Getter;
import lombok.Setter;

public class Ex16 {
//    Write a Java program to create a class called "Shape" with abstract methods for calculating area and perimeter,
//    and subclasses for "Rectangle", "Circle", and "Triangle".

    public static void main(String[] args) {
        Shape kolo = new Kolo(5.5);
        System.out.println(kolo);
        Shape prostokat = new Prostokat(5, 10);
        double areaRectangle = prostokat.area();
        double perimeter = prostokat.perimeter();
        System.out.print("\nArea is: " + areaRectangle);
        System.out.print("\nPerimeter is: " + perimeter);
    }
}

@Getter
@Setter
abstract class Shape {
    public abstract double area();

    public abstract double perimeter();
}

@Getter
@Setter
class Prostokat extends Shape {
    private double side1;
    private double side2;

    public Prostokat(double side1, double side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public double area() {
        return side1 * side2;
    }

    @Override
    public double perimeter() {
        return 2 * (side1 + side2);
    }
}

@Getter
@Setter
class Kolo extends Shape {
    private double radius;

    public Kolo(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Kolo{" +
                "radius=" + radius +
                '}' + "\nArea is: " + area() + "\nPerimeter is: " + perimeter();
    }
}
