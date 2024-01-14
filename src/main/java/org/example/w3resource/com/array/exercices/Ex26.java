package org.example.w3resource.com.array.exercices;

import java.util.Arrays;

public class Ex26 {
    //    Write a Java program to move all 0's to the end of an array. Maintain the relative order o
//    f the other (non-zero) array elements.
    public static void main(String[] args) {
        int[] arr = {2, 3, 9, 0, 7, 0, 1, 500, 5, 1};
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[j++] = arr[i];
            }
        }
        while (j < arr.length) {
            arr[j++] = 0;
        }
        System.out.println("Original array: " + Arrays.toString(arr));
    }
}
