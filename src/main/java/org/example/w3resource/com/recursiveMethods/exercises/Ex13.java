package org.example.w3resource.com.recursiveMethods.exercises;

public class Ex13 {
    //    Write a Java recursive method to calculate the product of all numbers in an array
    public static void main(String[] args) {
        int[] numbers = {2, -4, 5, 8, 15, 134, 14, 18, 22, 20, 12, 14};
        int product = calculateProduct(numbers, numbers.length);
        System.out.println(product);
    }
    public static int calculateProduct(int[] arr, int n) {
        if (n == 0) {
            return 1;
        }
        return arr[n - 1] * calculateProduct(arr, n - 1);
    }

}
