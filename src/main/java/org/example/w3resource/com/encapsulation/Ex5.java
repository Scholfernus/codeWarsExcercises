package org.example.w3resource.com.encapsulation;

public class Ex5 {
    //    Write a Java program to create a class called Circle with a private instance variable radius.
//    Provide public getter and setter methods to access and modify the radius variable. However,
//    provide two methods called calculateArea() and calculatePerimeter() that return the calculated area and perimeter
//    based on the current radius value.
    public static void main(String[] args) {
    Circle circle = new Circle();
    circle.setRadius(12.5);
        double radius = circle.getRadius();
        System.out.println(radius);
        System.out.println("Circle area's: " + circle.calculateArea());

        System.out.println("Circle perimeter's: " + circle.calculatePerimeter());
    }
}
class Circle{
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double calculateArea(){
        return Math.PI * radius * radius;
    }
    public double calculatePerimeter(){
        return 2*Math.PI * radius;
    }
}