package org.example.w3resource.com.basic1.from101to150;

import java.util.Scanner;

public class Ex115 {
    //    Write a Java program to check if a positive number is a palindrome or not.
//Input a positive integer: 151
//Is 151 is a palindrome number?
    public static void main(String[] args) {
        int num;

        // Create a Scanner object for user input
        Scanner in = new Scanner(System.in);

        // Prompt the user for a positive integer
        System.out.print("Input a positive integer: ");

        // Read the integer entered by the user
        int n = in.nextInt();

        // Display a message to check if the number is a palindrome
        System.out.printf("Is %d a palindrome number?\n", n);

        // Check if the number is a palindrome and print the result
        System.out.println(is_Palindrome(n));
    }

    // Function to reverse the digits of a number
    public static int reverse_nums(int n) {
        int reverse = 0;
        while (n != 0) {
            reverse *= 10;
            reverse += n % 10;
            n /= 10;
        }
        return reverse;
    }

    // Function to check if a number is a palindrome
    public static boolean is_Palindrome(int n) {
        return (n == reverse_nums(n));
    }
}

