package org.example.w3resource.com.basic1.from101to150;

import java.util.Arrays;

public class Ex107 {
    //    Write a Java program to check if an array of integers contains three increasing adjacent numbers.
    public static void main(String[] args) {
        int[] numbers = {10, 11, 12, 13, 14};
        System.out.println("Original array: " + Arrays.toString(numbers));
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < numbers[i + 1] && numbers[i + 1] < numbers[i + 2]) {
                System.out.println("liczby ułożone są rosnąco.");
                break;
            } else {
                System.out.println(false);
            }
        }
    }
}
