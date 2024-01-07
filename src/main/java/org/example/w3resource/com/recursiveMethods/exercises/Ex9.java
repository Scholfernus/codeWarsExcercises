package org.example.w3resource.com.recursiveMethods.exercises;

import java.util.Arrays;

public class Ex9 {
    //    Write a Java recursive method to find the sum of all odd numbers in an array.
    public static void main(String[] args) {
        int[] numbers = {2, -4, 5, 8, 15, 13, 14, 18, 22, 20, 12, 14};
        int sumOfArray = sumOfArray(numbers);
        System.out.println(sumOfArray);
    }

    private static int sumOfArray(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
            sum+=array[i];
            }
        }
        return sum;
    }
}
// public static int calculateOddNumberSum(int[] arr) {
//    return calculateOddNumberSum(arr, 0);
//  }
//
//  private static int calculateOddNumberSum(int[] arr, int index) {
//    // Base case: if the index reaches the end of the array, return 0
//    if (index == arr.length) {
//      return 0;
//    }
//
//    // Recursive case: check if the element at the current index is odd,
//    // and recursively call the method with the next index and add the current element if it is odd
//    int sum = calculateOddNumberSum(arr, index + 1);
//    if (arr[index] % 2 != 0) {
//      sum += arr[index];
//    }
//
//    return sum;
//  }
