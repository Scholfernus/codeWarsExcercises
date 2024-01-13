package org.example.w3resource.com.array.exercices;

import java.util.Arrays;

public class Ex16 {
    //    Write a Java program to remove duplicate elements from an array.
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 5, 6, 6, 7, 8, 9, 9};
        int[] uniqueArr = removeDuplicates(arr);
        System.out.println("Original array: " + Arrays.toString(arr));
        System.out.println("Array with duplicates removed: " + Arrays.toString(uniqueArr));
    }

    public static int[] removeDuplicates(int[] arr) {
        int[] uniqueArr = new int[arr.length];
        int j = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                uniqueArr[j++] = arr[i];
            }
        }
        uniqueArr[j++] = arr[arr.length - 1];
        return Arrays.copyOf(uniqueArr, j);
    }
}
