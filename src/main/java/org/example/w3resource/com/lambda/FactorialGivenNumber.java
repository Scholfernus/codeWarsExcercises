package org.example.w3resource.com.lambda;

import java.util.Scanner;
import java.util.function.LongUnaryOperator;

public class FactorialGivenNumber {
    public static void main(String[] args) {
        long sum = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type a number: ");
        int numb = scanner.nextInt();
        for (int i = 1; i <= numb; i++) {
            sum *= i;
        }
        System.out.println("Factorial of " + numb + " is: " + sum);
        LongUnaryOperator factorial = n -> {
            long result = 1;
            for (int i = 1; i <= n; i++) {
                result *= i;
            }
            return result;
        };
        long n = 7;
        long asLong = factorial.applyAsLong(n);
        System.out.println("Factorial of " + n + " is: " + asLong);
    }
}
