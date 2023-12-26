package org.example.w3resource.com.basic1.from101to150;

import java.util.Scanner;

public class Ex109 {
    //    Write a Java program to form a staircase shape of n coins where every k-th row must have exactly k coins.
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner in = new Scanner(System.in);

        // Prompt the user to input a positive integer
        System.out.print("Input a positive integer: ");

        // Read the user's input as an integer
        int n = in.nextInt();

        if (n > 0) {
            // Check if n is a positive integer
            double sqrtResult = Math.sqrt(8 * (long) n + 1);  // Calculate the square root
            int numRows = (int) ((sqrtResult - 1) / 2);      // Calculate the number of rows
            System.out.println("Number of rows: " + numRows);
        }

        // Close the input scanner
        in.close();
    }
}
