package org.example.w3resource.com.array.exercices;

import java.util.Arrays;

public class Ex23 {
    //     Write a Java program to test two arrays' equality.
    public static void main(String[] args) {
        int[] arr = {2, 3, 9, 7, 1, 500, 5, 8, 12, 33, 1};
        int[] arr2 = {1, 5, 3, 6, 8, 9, 4, 8, 7, 2, 12};
        boolean equals = Arrays.equals(arr, arr2);
        System.out.println(equals);
    }
}
