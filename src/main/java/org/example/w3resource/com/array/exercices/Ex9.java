package org.example.w3resource.com.array.exercices;

import java.util.Arrays;

public class Ex9 {
    //    Write a Java program to insert an element (specific position) into an array.
    public static void main(String[] args) {
        int[] numbers = {2, 3, 9, 7, 1, 500, -5, -8, 12, 33};
        int element = 55;
        int index = 5;
        System.out.println(Arrays.toString(numbers));
        for (int i = 0; i < numbers.length; i++) {
            if (i==index){
                index=numbers[i];
                numbers[i]=element;
            }
        }
        System.out.println(Arrays.toString(numbers));
    }
}
