package org.example.w3resource.com.array.exercices;

import java.util.Arrays;

public class Ex18 {
    //   . Write a Java program to find the second smallest element in an array.
    public static void main(String[] args) {
        int index = 0;
        int[] arr = {2, 3, 9, 7, 1, 500, 5, 8, 12, 33, 1};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (!(arr[index + 1] > arr[index])) {
                index++;
            } else {
                System.out.print(arr[index + 1] + " ->");
                break;
            }
        }
    }
}
