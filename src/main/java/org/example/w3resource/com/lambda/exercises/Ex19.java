package org.example.w3resource.com.lambda.exercises;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ex19 {
    // Write a Java program to implement a lambda expression to find the second largest and smallest element in an array.
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 3, 5, 2, 8, 6, 4, 9, 3, 1, 5, 45, 78, 11, -4, -5);
        System.out.println(numbers);
        List<Integer> sortedNumbers = numbers.stream()
                .sorted()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(sortedNumbers);
        if (sortedNumbers.size() >= 2) {
            System.out.println("Drugi najmniejszy element: " + sortedNumbers.get(1));
            System.out.println("Drugi największy element: " + sortedNumbers.get(sortedNumbers.size() - 2));
        } else {
            System.out.println("Tablica musi zawierać co najmniej dwa unikalne elementy");
        }
    }
}
