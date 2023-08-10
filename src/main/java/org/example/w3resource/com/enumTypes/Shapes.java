package org.example.w3resource.com.enumTypes;

public class Shapes {
    public static enum Shape {
        SQUARE,
        TRIANGLE,
        CIRCLE,
        RECTANGLE,
        HEXAGON
    }
    public static void main(String[] args) {
        Shape firstElement = Shape.SQUARE;
        Shape secondElement = Shape.TRIANGLE;
        Shape thirdElement = Shape.CIRCLE;
        Shape fourthElement = Shape.RECTANGLE;
        Shape fifthElement = Shape.HEXAGON;
        System.out.println("firstElement is " + firstElement
                + ".\nsecondElement is " + secondElement
                + ".\nthirdElement is " + thirdElement
                + ".\nfourthElement is " + fourthElement
                + ".\nfifthElement is " + fifthElement + ".");
    }
}
