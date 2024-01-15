package org.example.w3resource.com.array.exercices;

import java.util.Arrays;

public class Ex29 {
    //    Write a Java program to compute the average value of an array of integers except the largest and smallest values.
    public static void main(String[] args) {
        int[] arr = {2, 3, 9, 8, 7, 33, 1, 500, 5, 1};
        Arrays.sort(arr);
        int sum = 0;

        for (int numb : arr) {
            sum += numb;
        }
        int i = arr[arr.length - 1] - arr[0];
        sum = sum - i;
        double average = (double) sum / ((arr.length) - 2);
        System.out.println("Average of array is -> " + average);
    }
}
