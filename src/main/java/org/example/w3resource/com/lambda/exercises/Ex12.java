package org.example.w3resource.com.lambda.exercises;

import java.util.Arrays;
import java.util.List;

public class Ex12 {
    //  Write a Java program to create a lambda expression to multiply and sum all elements in a list of integers.
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 3, 5, 2, 8, 6, 4, 9, 3, 1, 5, 45, 78, 11, -4, -5);
        long reduce = numbers.stream().reduce(1, (a, b) -> a * b);
        int sum = numbers.stream().reduce(0, Integer::sum);
        System.out.println("Product of all elements in the list: " + reduce);
        System.out.println("Sum of all elements in the list: " + sum);
    }
}
