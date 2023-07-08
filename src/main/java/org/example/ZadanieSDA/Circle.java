package org.example.ZadanieSDA;
public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}

class Shape {
    int width;
    int length;

    public Shape(int width, int length) {
        this.width = width;
        this.length = length;
    }

    public double getArea() {
        int area = width * length;
        return area;
    }
}

class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        double areaResult = circle.getArea();
        System.out.println("Area: " + areaResult);

        Shape shape = new Shape(2, 8);
        double shapeArea = shape.getArea();
        System.out.println("Shape area: " + shapeArea);
    }
}
