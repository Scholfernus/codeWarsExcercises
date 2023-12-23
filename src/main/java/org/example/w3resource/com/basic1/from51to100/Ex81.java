package org.example.w3resource.com.basic1.from51to100;

import java.util.Arrays;

public class Ex81 {
    //    Write a Java program to swap the first and last elements of an array (length must be at least 1)
//    and create another array.
    public static void main(String[] args) {
        // Define an integer array, numbers
        int[] numbers = {20, 30, 40};

        // Print the elements of the original array
        System.out.println("Original Array: " + Arrays.toString(numbers));

        // Store the value of the first element in the variable x
        int x = numbers[0];

        // Swap the first and last elements of the array
        numbers[0] = numbers[numbers.length - 1];
        numbers[numbers.length - 1] = x;

        // Print the new array after swapping the first and last elements
        System.out.println("New array after swapping the first and last elements: " + Arrays.toString(numbers));
    }
}
