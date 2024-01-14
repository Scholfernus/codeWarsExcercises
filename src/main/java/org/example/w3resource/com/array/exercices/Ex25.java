package org.example.w3resource.com.array.exercices;

import java.util.Arrays;

public class Ex25 {
    //    Write a Java program to find common elements in three sorted (in non-decreasing order) arrays.
    public static void main(String[] args) {
        int[] arr = {2, 3, 9, 7, 1, 500, 5, 8, 12, 33, 1};
        int[] arr2 = {1, 5, 3, 6, 8, 9, 4, 8, 7, 2, 12};
        int[] arr3 = {3, 5, 7, 6, 8, 1, 6, 8, 1, 3, 6};
        Arrays.sort(arr);
        Arrays.sort(arr2);
        Arrays.sort(arr3);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==arr2[i]&&arr[i]==arr3[i]){
                System.out.println("Bingo, I found it: " + arr[i] );
            }
        }
    }
}
