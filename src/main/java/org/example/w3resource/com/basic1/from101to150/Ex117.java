package org.example.w3resource.com.basic1.from101to150;

import java.util.Scanner;

public class Ex117 {
    //    Write a Java program to compute the square root of a given number.
    //    Input a positive integer: 25 - Square root of 25 is: 5
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number from 1 to 100: ");
        int nextInt = scanner.nextInt();
        double sqrt = Math.sqrt(nextInt);
        if (sqrt % 1 == 0) {
            System.out.println("Square root of " + nextInt + " is: " + (int) sqrt);
        } else {
            System.out.println("The square root is not an integer. Eliminating this number.");
        }
    }
}
