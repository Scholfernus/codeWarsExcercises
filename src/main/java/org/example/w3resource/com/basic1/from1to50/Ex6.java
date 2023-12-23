package org.example.w3resource.com.basic1.from1to50;

import java.util.Scanner;

public class Ex6 {
    // Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
    //Test Data:
    //Input first number: 125
    //Input second number: 24
    //Expected Output :
    //125 + 24 = 149
    //125 - 24 = 101
    //125 x 24 = 3000
    //125 / 24 = 5
    //125 mod 24 = 5
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input first number: ");
        int a = scanner.nextInt();
        System.out.print("Input second number: ");
        int b = scanner.nextInt();
        System.out.println(a + " + " + b + " = " + (a + b));
        System.out.println(a + " - " + b + " = " + (a - b));
        System.out.println(a + " * " + b + " = " + a * b);
        System.out.println(a + " / " + b + " = " + a / b);
    }
}
