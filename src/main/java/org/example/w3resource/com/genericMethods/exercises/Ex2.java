package org.example.w3resource.com.genericMethods.exercises;

import java.util.List;

public class Ex2 {
    //    Write a Java program to create a generic method that takes a list of numbers and returns the sum of all
//    the even and odd numbers.
    public static <T extends Number> void calculateSum(List<T> numbers) {
        double evenSum = 0;
        double oddSum = 0;
        for (T num : numbers) {
            if (num.doubleValue() % 2 == 0) {
                evenSum += num.doubleValue();
            } else {
                oddSum += num.doubleValue();
            }
        }
        System.out.println("\nOriginal list of numbers: " + numbers);
        System.out.println("Sum of even numbers: " + evenSum);
        System.out.println("Sum of odd numbers: " + oddSum);
    }

    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6, 7);
        List<Double> doubles = List.of(2.0, 1.5, 4.5, 2.5, 1.5);
        calculateSum(integers);
        calculateSum(doubles);
    }
}
