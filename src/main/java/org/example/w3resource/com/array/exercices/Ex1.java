package org.example.w3resource.com.array.exercices;

import java.util.Arrays;

public class Ex1 {
    //Write a Java program to sort a numeric array and a string array
    public static void main(String[] args) {
        int[] numbers = {2, 3, 9, 7, 1, 5, -5, 8, 12};
        String[] words = {"koko", "bebe", "cece", "didi", "mama"};
        System.out.println("Unsorted array: " + Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println("Sorted array: " + Arrays.toString(numbers));
        System.out.println("Unsorted array words: " + Arrays.toString(words));
        Arrays.sort(words);
        System.out.println("Sorted array words: " + Arrays.toString(words));

    }
}
