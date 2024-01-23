package org.example.w3resource.com.lambda.exercises;

import java.util.Scanner;
import java.util.function.Predicate;

public class Ex18 {
    //    Write a Java program to implement a lambda expression to check if a given number is a perfect square.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give some number: ");
        int number = scanner.nextInt();
        Predicate<Integer> perfectNumber = integer -> {
            int sqrt = (int) Math.sqrt(integer);
            return sqrt*sqrt==integer;
        };
        boolean num1 = perfectNumber.test(number);
        System.out.println(num1);
    }
}
