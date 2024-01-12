package org.example.w3resource.com.array.exercices;

import java.util.Arrays;

public class Ex8 {
    //    Write a Java program to copy an array by iterating the array.
    public static void main(String[] args) {
        int[] numbers = {2, 3, 9, 7, 1, 5, -5, -8, 12, 33};
        int[] newArray = new int[numbers.length];
        System.out.println(Arrays.toString(numbers));
        for (int i = 0; i < numbers.length; i++) {
            newArray[i] = numbers[i];
        }
        System.out.println(Arrays.toString(newArray));
    }
}
