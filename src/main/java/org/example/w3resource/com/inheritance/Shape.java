package org.example.w3resource.com.inheritance;

public class Shape {
    public double getArea() {
        System.out.println("Area");
        return 0.0;
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }
}

class Main3 {
    public static void main(String[] args) {
        Shape shape = new Shape();
        Rectangle rectangle = new Rectangle(3.0,10.0);
        double area = rectangle.getArea();
        System.out.println("The area of the rectangle is: " + area);
    }
}