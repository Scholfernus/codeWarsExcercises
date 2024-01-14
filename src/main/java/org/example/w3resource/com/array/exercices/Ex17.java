package org.example.w3resource.com.array.exercices;

import java.util.Arrays;

public class Ex17 {
    //    Write a Java program to find the second largest element in an array.
    public static void main(String[] args) {
        int[] arr = {2, 3, 9, 7, 1, 500, 5, 8, 12, 33, 1};
        int index = arr.length-1;
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        for (int i = arr.length; i > 0; i--) {
            if (!(arr[index] > arr[index - 1])) {
                index--;
            } else {
                System.out.print(arr[index - 1] + " ->");
                break;
            }
        }
    }
}
