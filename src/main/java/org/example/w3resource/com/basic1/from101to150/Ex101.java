package org.example.w3resource.com.basic1.from101to150;

import java.util.Arrays;

public class Ex101 {
    // Write a Java program to determine whether the number 10 in a given array of integers exceeds 20.

    public static void main(String[] args) {
        int[] array_nums = {10, 11, 10, 30, 45, 20, 33, 53};
        System.out.println("Original Array: " + Arrays.toString(array_nums));

        int ctr1 = 0; // Initialize a counter to count occurrences of value 10
        int ctr2 = 0; // Initialize a counter to count occurrences of value 20

        for (int i = 0; i < array_nums.length; i++) {
            if (array_nums[i] == 10)
                ctr1++; // Increment ctr1 when the element is equal to 10

            if (array_nums[i] == 20)
                ctr2++; // Increment ctr2 when the element is equal to 20
        }

        System.out.printf(String.valueOf(ctr1 > ctr2)); // Check if the count of 10 is greater than the count of 20
        System.out.printf("\n");
    }
}
