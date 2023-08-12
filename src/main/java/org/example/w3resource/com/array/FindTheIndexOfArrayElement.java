package org.example.w3resource.com.array;

import java.util.Arrays;

public class FindTheIndexOfArrayElement {
    public static void main(String[] args) {
        int[] numbers = {2, 6, 1, 5, 9, 7, 22, 36, 5, 4, 1};
        int target = 1;
        System.out.println("Number " + target + " is under index " + findIndex(numbers, target));
    }

    public static int findIndex(int[] array, int number) {
        if (array == null) return -1;
        for (int i = 0; i < array.length; i++) {
            if (number == array[i]) {
                return i;
            }
        }
        System.out.println("There's not such number!");
        return -1;
    }
}
