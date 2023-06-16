package org.example.bingChat;

import java.util.Arrays;

public class SortowanieBabelkowe {
    public static void main(String[] args) {
        boolean swapped;
        int[] numbers = {83, 4, -6, 12, 7, 33, -15, 0};
        for (int i = 0; i < numbers.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < numbers.length - i - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                    swapped =true;
                }
            }
            if (!swapped){
                break;
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Liczba " + (i +1) + ": " + numbers[i]);
        }
        System.out.println(Arrays.toString(numbers));
    }
}