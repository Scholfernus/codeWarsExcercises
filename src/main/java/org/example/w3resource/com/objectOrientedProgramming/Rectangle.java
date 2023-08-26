package org.example.w3resource.com.objectOrientedProgramming;

public class Rectangle {
    private double width;
    private double height;

    public Rectangle(double width, double height) {

        this.width = width;
        this.height = height;
    }

    public double area(double width, double height) {
        double area = width * height;
        return area;
    }

    public double perimeter(double width, double height) {
        double perimeter = 2 * (width + height);
        return perimeter;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double area2() {
        return width * height;
    }

    public double perimeter2() {
        return 2 * (width + height);
    }
}

class Main2 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5.5, 2.0);
        double area = rectangle.area(25.5, 10.0);
        System.out.println(area);
        double perimeter = rectangle.perimeter(25.5, 10.5);
        System.out.println(perimeter);
    }
}
