package org.example.w3resource.com.abstractClasses;

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
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

class Triangle extends Shape {
    private double a, b, h;

    public Triangle(double a, double b, double h) {
        this.a = a;
        this.b = b;
        this.h = h;
    }

    @Override
    public double calculateArea() {
        double s = (a + b + h) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - h));
    }

    @Override
    public double calculatePerimeter() {
        return a + b + h;
    }
}

class Main2 {
    public static void main(String[] args) {
        double radius = 4.0;
        Circle circle = new Circle(radius);
        double a = 3;
        double b = 4;
        double h = 5;
        Triangle triangle = new Triangle(a, b, h);
        System.out.println("Radius of the Circle " + radius);
        System.out.printf("Area of the Circle: %.2f", circle.calculateArea());
        System.out.printf("\nPerimeter of the Circle: %.2f", circle.calculatePerimeter());
        System.out.println("\nSides of the Triangle are: " + a + ',' + b + ',' + h);
        System.out.println("Area of the Triangle: " + triangle.calculateArea());
        System.out.println("Perimeter of the Triangle: " + triangle.calculatePerimeter());
    }
}