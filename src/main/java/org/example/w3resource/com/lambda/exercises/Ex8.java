package org.example.w3resource.com.lambda.exercises;

import java.util.Scanner;
import java.util.function.LongUnaryOperator;

public class Ex8 {
    //    Write a lambda expression to implement a lambda expression to calculate the factorial of a given number.
    public static void main(String[] args) {

        LongUnaryOperator factorial = n -> {
            long sum = 1;
            for (int i = 1; i <= n; i++) {
                sum *= i;
            }
            return sum;
        };
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj dowolną liczbę: ");
        long numb = scanner.nextLong();
        long asLong = factorial.applyAsLong(numb);
        System.out.println("Factorial of " + numb + " is: " + asLong);
    }
}
