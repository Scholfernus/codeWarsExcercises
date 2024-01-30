package org.example.w3resource.com.interfaceClass.exercises;

public class Ex5 {
    //    Write a Java program to create an interface Resizable with methods resizeWidth(int width) and
    //    resizeHeight(int height) that allow an object to be resized. Create a class Rectangle that implements the
    //    Resizable interface and implements the resize methods.
    public static void main(String[] args) {
       Trojkat rectangle = new Trojkat(100, 150);
       rectangle.printSize();
       rectangle.resizeWidth(150);
       rectangle.resizeHeight(200);
       rectangle.printSize();
    }
}
interface Resizable{
    void resizeWidth(int width);
    void resizeHeight(int height);
}
class Trojkat implements Resizable{
    private int width;
    private int height;

    public Trojkat(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void resizeWidth(int width) {
        this.width = width;
    }

    @Override
    public void resizeHeight(int height) {
        this.height = height;
    }
    public void printSize() {
        System.out.println("Width: " + width + ", Height: " + height);
    }
}