package org.example.w3resource.com.basic1.from51to100;

import java.util.Scanner;

public class Ex54 {
    // Write a Java program that accepts three integers from the user and returns true if two or more of them (integers)
    // have the same rightmost digit. The integers are non-negative.
    public static void main(String[] args) {
        System.out.print("Input the first number: ");
        Scanner scanner = new Scanner(System.in);
        int first = scanner.nextInt();
        System.out.print("Input the second number: ");
        int second = scanner.nextInt();
        System.out.print("Input the third number: sum o f two numbers: ");
        int third = scanner.nextInt();
        // Prompt the user to input a boolean value (true or false)
        System.out.print("Input a boolean value (true/false): ");
        boolean xyz = scanner.nextBoolean();

        // Calculate the result using the test_last_digit function and display it
        System.out.print("The result is: " + test_last_digit(first, second, third, xyz));

        // Print a new line for better formatting
        System.out.print("\n");
    }
    // Function to test if any two numbers have the same last digit based on the boolean input
    public static boolean test_last_digit(int p, int q, int r, boolean xyz) {
        return (p % 10 == q % 10) || (p % 10 == r % 10) || (q % 10 == r % 10);
    }
}
