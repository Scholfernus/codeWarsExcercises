package org.example.w3resource.com.basic1;

import java.util.Scanner;

public class Ex51 {
    // Write a Java program to convert a string to an integer.
    // Input a number(string): 25  The integer value is: 25
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a number(string): ");
        String nextInt = scanner.nextLine();
        int number = Integer.parseInt(nextInt);
        System.out.println("The integer value is: " + number);
        System.out.printf("The integer value is: %d", number);
    }
}
