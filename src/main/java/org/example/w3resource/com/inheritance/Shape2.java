package org.example.w3resource.com.inheritance;

public abstract class Shape2 {
    private int sideA;
    private int sideB;


    public double getPerimeter() {
        return (2 * sideA) + (2 * sideB);
    }

    public double getAreal() {
        return sideA * sideB;
    }

    public abstract double getArea();
}

class Circle extends Shape2 {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

class Main8 {
    public static void main(String[] args) {
        double r = 8.0;
        Circle c1 = new Circle(r);
        System.out.println("Radius of the circle = " + r);
        System.out.println("Perimeter: " + c1.getPerimeter());
        System.out.println("Area: " + c1.getArea());
        r = 3.2;
        Circle c2 = new Circle(r);
        System.out.println("\nRadius of the circle = " + r);
        System.out.printf("Perimeter: %.2f",c2.getPerimeter());
        System.out.printf("\nArea: %.2f", c2.getArea());
    }
}