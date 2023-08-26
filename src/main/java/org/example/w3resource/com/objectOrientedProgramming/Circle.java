package org.example.w3resource.com.objectOrientedProgramming;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI * (radius * radius);
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }
}

class Main3 {
    public static void main(String[] args) {
        Circle circle = new Circle(12.5);
        double radius = circle.getRadius();
        circle.setRadius(10.0);
        double area = circle.area();
        System.out.println(area);
        circle.setRadius(20);
        double circumference = circle.getCircumference();
        System.out.println(circumference);

    }
}
