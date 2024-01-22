package org.example.w3resource.com.lambda.exercises;

import java.util.Arrays;
import java.util.List;

public class Ex15 {
    //    Write a Java program to implement a lambda expression to calculate the sum of squares
//    of all odd and even numbers in a list.
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 3, 5, 2, 8, 6, 4, 9, 3, 1, 5, 45, 78, 11, -4, -5);
        int sumOfEvenNumbers = numbers.stream()
                .filter(integer -> integer % 2 == 0)
                .mapToInt(i->i*i)
                .sum();
        int sumOfOddNumbers = numbers.stream()
                .filter(integer -> integer % 2 != 0)
                .mapToInt(i->i*i)
                .sum();
        System.out.println(sumOfEvenNumbers);
        System.out.println(sumOfOddNumbers);
    }
}
