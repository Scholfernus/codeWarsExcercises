package org.example.w3resource.com.basic1;

public class Ex15 {
    //Write a Java program to swap two variables.
    public static void main(String[] args) {
        int a = 17;
        int b = 10;
        int temp = 0;
        System.out.println("a = " + a + ","+" b = " + b);
        temp = a;
        a = b;
        b = temp;
        System.out.println("a = " + a + ","+" b = " + b);
    }
}
