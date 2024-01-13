package org.example.w3resource.com.array.exercices;

import java.util.Arrays;

public class Ex11 {
    //    Write a Java program to reverse an array of integer values.
    public static void main(String[] args) {
        int[] numbers = {2, 3, 9, 7, 1, 500, -5, -8, 12, 33};
        int temp = 0;
        System.out.println(Arrays.toString(numbers));
        for (int i = 0; i < numbers.length / 2; i++) {
            temp = numbers[i];
            numbers[i] = numbers[numbers.length - i - 1];
            numbers[numbers.length - i - 1] = temp;
        }
        System.out.println(Arrays.toString(numbers));
    }
}
