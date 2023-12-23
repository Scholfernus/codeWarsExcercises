package org.example.w3resource.com.basic1.from51to100;

import java.util.Arrays;

public class Ex83 {
    //    Write a Java program to multiply the corresponding elements of two integer arrays.
    public static void main(String[] args) {
        int[] first = {1, 3, -5, 4};
        int[] second = {1, 4, -5, -2};
        int[] numb = new int[4];
        for (int i = 0; i < first.length; i++) {
            numb[i] = first[i] * second[i];
        }
        System.out.print(Arrays.toString(numb));
    }
}
