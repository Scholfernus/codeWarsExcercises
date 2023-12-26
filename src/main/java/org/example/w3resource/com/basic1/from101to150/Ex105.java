package org.example.w3resource.com.basic1.from101to150;

import java.util.Arrays;

public class Ex105 {
    //    Write a Java program to check if a group of numbers (l) at the start and end of a given array are the same
    public static void main(String[] args) {
        int[] numbers = {10, 11, 10, 30, 45, 20, 33, 53};
        System.out.println(Arrays.toString(numbers));
        boolean check = check(numbers);
        System.out.println(check);
    }

    public static boolean check(int[] numb) {
        int i = 0;
        if (numb[i] == numb[numb.length - 1 - i]) {
            i++;
        } else {
            System.out.println("elementy tablicy nie mają takich samych elementów!");
        }
        return false;
    }
}




