package org.example.w3resource.com.array.exercices;

import java.util.Arrays;

public class Ex10 {
    //    Write a Java program to find the maximum and minimum value of an array.
    public static void main(String[] args) {
        int[] numbers = {2, 3, 9, 7, 1, 500, -5, -8, 12, 33};
        System.out.println(Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println("Max value is: " + numbers[numbers.length - 1] + ", Min value is " + numbers[0]);
    }
}
