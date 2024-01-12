package org.example.w3resource.com.array.exercices;

import java.sql.Array;
import java.util.Arrays;

public class Ex7 {
    //    Write a Java program to remove a specific element from an array.
    public static void main(String[] args) {
        int[] numbers = {2, 3, 9, 7, 1, 5, -5, -8, 12, 33};
        int removeIndex = 5;
        System.out.println("Original Array : " + Arrays.toString(numbers));
        for (int i = removeIndex; i < numbers.length - 1; i++) {
            numbers[i] = numbers[i + 1];
        }
        System.out.println("After removing the second element: " + Arrays.toString(numbers));
    }
}
