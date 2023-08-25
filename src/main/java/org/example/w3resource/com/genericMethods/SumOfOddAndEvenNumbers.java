package org.example.w3resource.com.genericMethods;

import java.util.Arrays;
import java.util.List;

public class SumOfOddAndEvenNumbers {
    public static <T extends Number> void calculateNumberSum(List<T> numbers) {
        double evenSum = 0;
        double oddSum = 0;
        for (T number : numbers) {
            if (number.doubleValue() % 2 == 0) {
                evenSum += number.doubleValue();
            } else {
                oddSum += number.doubleValue();
            }
        }
        System.out.println("\nOriginal list of numbers: " + numbers);
        System.out.println("Sum of even numbers: " + evenSum);
        System.out.println("Sum of odd numbers: " + oddSum);
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 3, 2, 5, 14, 6, 5, 9, 7, 2, 5, 1, 8, 10);
        List<Double> doubles = List.of(2.0, 1.5, 4.5, 2.5, 1.5);

        calculateNumberSum(numbers);
        calculateNumberSum(doubles);

    }
}
