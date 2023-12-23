package org.example.w3resource.com.basic1.from51to100;

public class Ex76 {
    //  Write a Java program to test if the first and last element of two integer arrays are the same.
    //  The array length must be greater than or equal to 2.
    public static void main(String[] args) {
        int[] numb = {50, -20, 0, 30, 40, 60, 25};
        int[] numb2 = {40, -10, 10, 20, 30, 40, 25};
        boolean b = numb[0] == numb2[0]||numb[numb.length-1]==numb2[numb2.length - 1];
        System.out.println(b);
    }
}
