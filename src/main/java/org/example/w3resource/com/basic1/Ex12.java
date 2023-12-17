package org.example.w3resource.com.basic1;

import java.util.Scanner;

public class Ex12 {
    //Write a Java program that takes three numbers as input to
    // calculate and print the average of the numbers.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input first number: ");
        int a = scanner.nextInt();
        System.out.print("Input second number: ");
        int b = scanner.nextInt();
        System.out.print("Input third number: ");
        int c = scanner.nextInt();
        System.out.println("Average = " + (a+b+c)/3);
    }
}
