package org.example.w3resource.com.lambda.exercises;

import java.util.*;
import java.util.stream.Collectors;

public class Ex7 {
    //    Write a Java program to implement a lambda expression to remove duplicates from a list of integers.
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 3, 4, 3, 2, 5, 6, 1, 7, 7, 8, 10);
        System.out.println(nums);
        List<Integer> uniqueNumbers = new ArrayList<>();
        Set<Integer> uniqueNumbers2 = new HashSet<>();
        nums.stream()
                .distinct()
                .forEach(uniqueNumbers::add);
        System.out.println(uniqueNumbers);
        for (int number : nums) {
            if (uniqueNumbers2.add(number)) {
                uniqueNumbers.add(number);
            }
        }
        System.out.println(uniqueNumbers2);
        System.out.println(uniqueNumbers);
    }
}