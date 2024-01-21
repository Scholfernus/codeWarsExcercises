package org.example.w3resource.com.lambda.exercises;

import java.util.function.Predicate;

public class Ex9 {
    //    Write a Java program to implement a lambda expression to create a lambda expression to check if a number is prime.
    public static void main(String[] args) {
        // Define the prime check lambda expression
        Predicate<Integer> is_Prime = n -> {
            if (n <= 1) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        };
        // Check if a number is prime using the lambda expression
        int n = 17;
        boolean isPrimeResult = is_Prime.test(n);
        // Print the prime check result
        System.out.println(n + " is prime? " + isPrimeResult);
        // Check if a number is prime using the lambda expression
        n = 15;
        isPrimeResult = is_Prime.test(n);
        // Print the prime check result
        System.out.println("\n"+n + " is prime? " + isPrimeResult);
    }
}
