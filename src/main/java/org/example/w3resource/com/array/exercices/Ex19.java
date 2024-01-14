package org.example.w3resource.com.array.exercices;

import java.util.Arrays;

public class Ex19 {
    //    Write a Java program to add two matrices of the same size.
    public static void main(String[] args) {
        int[] arr = {2, 3, 9, 7, 1, 500, 5, 8, 12, 33, 1};
        int[] arr2 = {-2, -3, -9, -7, -1, -500, -5, -8, -12, -33, 1};
        int[] arrSum = new int[arr.length];
        arrSum = array(arr, arr2);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arrSum));
    }

    public static int[] array(int[] array1, int[] array2) {
        int[] sum = new int[array1.length];
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                for (int k = 0; k < sum.length; k++) {
                    if (i == k && j == k) {
                        sum[k] = array1[i] + array2[j];
                    }
                }
            }
        }
        return sum;
    }
}
