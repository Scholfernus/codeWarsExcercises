package org.example.w3resource.com.basic1.from51to100;

import java.util.Scanner;

public class Ex52 {
    // Write a Java program to calculate the sum of two integers and return true if the sum is equal to a third integer.
    public static void main(String[] args) {
        System.out.print("Input the first number: ");
        Scanner scanner = new Scanner(System.in);
        int first = scanner.nextInt();
        System.out.print("Input the second number: ");
        int second = scanner.nextInt();
        System.out.print("Input the third number: sum o f two numbers: ");
        int third = scanner.nextInt();
        if (first + second == third) {
            System.out.println("The result is: true");
        } else {
            System.out.println("The result is: false");
        }
    }
    // System.out.print("The result is: " + sumoftwo(x, y, z));
    // Function to check if the sum of two numbers equals the third number
    //    public static boolean sumoftwo(int p, int q, int r) {
    //        return ((p + q) == r || (q + r) == p || (r + p) == q);
    //    }
}
