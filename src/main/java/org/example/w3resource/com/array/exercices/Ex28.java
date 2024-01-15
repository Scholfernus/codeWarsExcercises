package org.example.w3resource.com.array.exercices;

import java.util.Arrays;

public class Ex28 {
    //    Write a Java program to get the difference between the largest and smallest values in an array of integers.
    //    The array must have a length of at least 1.
    public static void main(String[] args) {
        int[] arr = {2, 3, 9, 8, 7, 33, 1, 500, 5, 1};
        if (arr.length >= 1){
            Arrays.sort(arr);
        }
        int i = arr[arr.length - 1] - arr[0];
        System.out.println(i);
    }
}
