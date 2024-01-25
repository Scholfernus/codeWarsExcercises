package org.example.w3resource.com.objectOrientedProgramming.exercises;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

public class Ex3 {
    //    Write a Java program to create a class called "Rectangle" with width and height attributes.
//    Calculate the area and perimeter of the rectangle
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 4);
        double area = rectangle.getHeight() * rectangle.getWidth();
        System.out.println(area);
        double perimeter = rectangle.getHeight() * 2 + rectangle.getWidth() * 2;
        System.out.println(perimeter);
        double area1 = Rectangle.getArea(3.5, 4.5);
        double perimeter1 = Rectangle.getPerimeter(3.5, 4.5);
        System.out.println(area1);
        System.out.println(perimeter1);
    }
}

@Getter
@Setter
@RequiredArgsConstructor
class Rectangle {
    private double width;
    private double height;

    public static double getArea(double a, double b) {
        return a * b;
    }

    public static double getPerimeter(double c, double d) {
        return 2 * (c + d);
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

}