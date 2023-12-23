package org.example.w3resource.com.basic1.from1to50;

import java.util.Random;

public class Ex39 {
    //Write a Java program to create and display a unique three-digit number using 1, 2, 3, 4.
    // Also count how many three-digit numbers are there.
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};
        Random random = new Random();
        int []array2 = new int[3];
        for (int i = 1; i < 3; i++) {
            int number = random.nextInt(array[i]);
            array2[i]=number;
        }
        for (int number:array2) {
            System.out.print(number);
        }
    }
}
