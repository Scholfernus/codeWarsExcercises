package org.example.w3resource.com.lambda.exercises;

import java.util.Arrays;
import java.util.List;
import java.util.stream.DoubleStream;

public class Ex6 {
    //  Write a Java program to implement a lambda expression to find the average of a list of doubles.
    public static void main(String[] args) {
        List<Double> nums = Arrays.asList(3.5, 7.5, 4.3, 4.7, 5.1, 13.3);
        System.out.println(nums);
        double average = nums.stream().mapToDouble(Double::doubleValue).average().orElse(0.0);
        System.out.printf("Average %.2f",average);
    }
}
