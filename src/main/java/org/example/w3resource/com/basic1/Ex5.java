package org.example.w3resource.com.basic1;

import java.util.Scanner;

public class Ex5 {
    // Write a Java program that takes two numbers as input and displays the product of two numbers.
    //Test Data:
    //Input first number: 25
    //Input second number: 5
    //Expected Output :
    //25 x 5 = 125
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input first number: ");
        int a = scanner.nextInt();
        System.out.print("Input second number: ");
        int b = scanner.nextInt();
        System.out.println(a + " * " + b + " = " + a * b);
    }
}
