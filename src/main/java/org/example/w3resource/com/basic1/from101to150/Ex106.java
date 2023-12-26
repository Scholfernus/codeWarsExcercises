package org.example.w3resource.com.basic1.from101to150;

import java.util.Arrays;

public class Ex106 {
    // Write a Java program to create an array left shifted from a given array of integers.
    public static void main(String[] args) {
        int[] numbers = {10, 11, 12, 13, 14};
        System.out.println("Original array: " + Arrays.toString(numbers));

        int temp = numbers[0];
        for (int i = 0; i < numbers.length - 1; i++) {
            numbers[i] = numbers[i + 1];
        }
        numbers[numbers.length - 1] = temp;

        System.out.println("Left shifted array: " + Arrays.toString(numbers));
    }
}
