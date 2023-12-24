package org.example.w3resource.com.basic1.from51to100;

import java.util.Arrays;

public class Ex94 {
    // Write a Java program to rearrange all the elements of a given array of integers
    // so that all the odd numbers come before all the even numbers.
    public static void main(String[] args) {
        int[] numbers = {2, 15, 22, 24, 456, -4, -25, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Current array: " + Arrays.toString(numbers));

        rearrangeArray(numbers);

        System.out.print("Array after rearrange: " + Arrays.toString(numbers) + "\n");
    }

    private static void rearrangeArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            // Szukaj parzystej liczby od lewej
            while (arr[left] % 2 != 0 && left < right) {
                left++;
            }
            // Szukaj nieparzystej liczby od prawej
            while (arr[right] % 2 == 0 && left < right) {
                right--;
            }
            // Zamień miejscami, jeśli znaleziono odpowiednie liczby
            if (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
    }
}
