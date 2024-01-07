package org.example.w3resource.com.recursiveMethods.exercises;

public class Ex12 {
    //     Write a Java recursive method to find the maximum element in an array.
    public static void main(String[] args) {
        int[] numbers = {2, -4, 5, 8, 15, 134, 14, 18, 22, 20, 12, 14};
        int biggest = findMax(numbers, numbers.length);
        System.out.println(biggest);
    }

    public static int findMax(int[] arr, int n) {
        if (n == 1) {
            return arr[0];
        }
        return Math.max(arr[n - 1], findMax(arr, n - 1));
    }
}

