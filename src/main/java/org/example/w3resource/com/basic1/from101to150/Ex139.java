package org.example.w3resource.com.basic1.from101to150;

import java.util.Arrays;

public class Ex139 {
    //    Write a Java program to get the index of the first and the last number of a subarray where the sum of numbers is zero.
    //    This is from a given array of integers. Original Array : [1, 2, 3, -6, 5, 4]
    //    Index of the subarray of the said array where the sum of numbers is zero: [0, 3]
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, -6, 5, 4};
        int sum = 0;
        boolean found = false;
        for (int i = 0; i < numbers.length; i++) {
            sum = 0; // Resetuj sumę dla każdej nowej pozycji startowej
            for (int j = i; j < numbers.length; j++) {
                sum += numbers[j];
                if (sum == 0) {
                    // Znaleziono podtablicę o sumie równiej zero
                    System.out.println("Index of the subarray: [" + i + ", " + j + "]");
                    found = true;
                    break;
                }
            }
            if (found) {
                break;
            }
        }
    }
}
