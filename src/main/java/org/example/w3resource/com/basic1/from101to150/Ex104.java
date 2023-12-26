package org.example.w3resource.com.basic1.from101to150;

import java.util.Arrays;

public class Ex104 {
    //    Write a Java program to create an array from a given array of integers.
//    The newly created array will contain the elements from the given array before the last element value of 10.
    public static void main(String[] args) {
        int counter = -1;
        int[] numbers = {10, 11, 10, 30, 45, 20, 33, 53};
        System.out.println(Arrays.toString(numbers));

        // Znajdź indeks ostatniego wystąpienia liczby 10
        for (int i = numbers.length - 1; i >= 0; i--) {
            if (numbers[i] == 10) {
                counter = i;
                break;
            }
        }
        if (counter!=-1){
            int[]newArray = new int[counter];
            for (int i = 0; i < newArray.length; i++) {
                newArray[i]=numbers[counter-i];
            }
            System.out.println(newArray.length);
            System.out.print(Arrays.toString(newArray));
        }
    }
}
