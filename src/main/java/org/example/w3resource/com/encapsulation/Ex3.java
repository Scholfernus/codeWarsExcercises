package org.example.w3resource.com.encapsulation;

public class Ex3 {
    //    Write a Java program to create a class called Rectangle with private instance variables length and width.
//    Provide public getter and setter methods to access and modify these variables.
    public static void main(String[] args) {
    Rectangle rectangle = new Rectangle();
    rectangle.setLength(25);
    rectangle.setWidth(12);

        int length = rectangle.getLength();
        int width = rectangle.getWidth();

        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
    }
}
class Rectangle{
    private int length;
    private int width;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}