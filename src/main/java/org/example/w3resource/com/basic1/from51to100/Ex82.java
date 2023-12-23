package org.example.w3resource.com.basic1.from51to100;

import java.util.Arrays;

public class Ex82 {
    //     Write a Java program to find the largest element between the first, last,
//     and middle values in an array of integers (even length).
    public static void main(String[] args) {
        int[] origin = {20, 30, 40, 50, 67};
        // Print the elements of the original array
        System.out.println("Original Array: " + Arrays.toString(origin));

        // Initialize a variable max_val with the value of the first element
        int max_val = origin[0];

        // Check if the last element is greater than max_val
        if (max_val <= origin[origin.length - 1])
            max_val = origin[origin.length - 1];

        // Check if the middle element is greater than max_val
        if (max_val <= origin[origin.length / 2])
            max_val = origin[origin.length / 2];

        // Print the largest element among the first, last, and middle values
        System.out.println("Largest element between first, last, and middle values: " + max_val);
    }
}
