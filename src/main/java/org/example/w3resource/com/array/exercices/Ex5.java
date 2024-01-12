package org.example.w3resource.com.array.exercices;

import java.util.Arrays;

public class Ex5 {
    //    Write a Java program to test if an array contains a specific value
    public static void main(String[] args) {
        int[] numbers = {2, 3, 9, 7, 1, 5, -5, -8, 12, 33};
        String[] words = {"koko", "bebe", "cece", "didi", "mama"};
        String value1 = "zetzet";
        int value2 = 33;
        for (String seek : words) {
            if (value1.equals(seek)) {
                System.out.println("We've got it");
            }
        }
        for (int numb : numbers) {
            if (numb == value2) {
                System.out.println("We've got it: " + numb);
            }
        }
    }
}
