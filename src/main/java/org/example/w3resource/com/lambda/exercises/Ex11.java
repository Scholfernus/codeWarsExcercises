package org.example.w3resource.com.lambda.exercises;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Ex11 {
    //  Write a Java program to implement a lambda expression to find the maximum and minimum values in a list of integers.
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 3, 5, 2, 8, 6, 4, 9, 3, 1, 5, 45, 78, 11, 0, -4, -5);
        numbers.sort(Comparator.naturalOrder());
        Integer minInteger = numbers.stream().min(Integer::compare).get();
        Integer maxInteger = numbers.stream().max(Integer::compare).get();
        System.out.println(minInteger);
        System.out.println(maxInteger);

        // Create a list of integers
        List<Integer> nums = Arrays.asList(12, 15, 0, 8, 7, 9, -6);
        System.out.println("Original values of the said array: "+nums);
        // Find the maximum value using lambda expression
        Optional<Integer> max = nums.stream()
                .max((x, y) -> x.compareTo(y));

        // Find the minimum value using lambda expression
        Optional<Integer> min = nums.stream()
                .min((x, y) -> x.compareTo(y));

        // Print the maximum and minimum values
        System.out.println("Maximum value: " + max.orElse(null));
        System.out.println("Minimum value: " + min.orElse(null));
    }
}
