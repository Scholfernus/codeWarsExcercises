package org.example.w3resource.com.objectOrientedProgramming.exercises;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Map;

public class Ex4 {
    //    Write a Java program to create a class called "Circle" with a radius attribute.
//    You can access and modify this attribute. Calculate the area and circumference of the circle.
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        double area = circle.area();
        double circumference = circle.circumference();
        System.out.printf("Area: %.2f\n", area);
        System.out.printf("Circumference: %.2f\n", circumference);
    }
}

@Getter
@Setter
@AllArgsConstructor
class Circle {
    private double radius;

    public double area() {
        return Math.PI * radius * radius;
    }

    public double circumference() {
        return 2 * Math.PI * radius;
    }
}