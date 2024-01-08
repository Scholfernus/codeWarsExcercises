package org.example.w3resource.com.enumTypes.exercises;

public class Ex3 {
    public enum Shape{
        SQUARE,
        CIRCLE,
        RECTANGLE,
        TRIANGLE,
        HEXAGON;
    }

    public static void main(String[] args) {
        Shape firstShape = Shape.CIRCLE;
        Shape secondShape = Shape.SQUARE;
        System.out.println(firstShape + ", "+ secondShape);
    }
}
