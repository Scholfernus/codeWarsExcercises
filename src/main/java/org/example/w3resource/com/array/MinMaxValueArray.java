package org.example.w3resource.com.array;

import java.util.Arrays;
import java.util.OptionalInt;

public class MinMaxValueArray {
    public static void main(String[] args) {
        int[] numbers = {9, 8, 10, 5, 6, 3, 42, 7, 5, 20};
        minValue(numbers);
        maxValue(numbers);
    }

    public static void minValue(int[] array) {
        OptionalInt mini = Arrays.stream(array).min();
        for (int num : array) {
            if (mini.getAsInt() == num) {
                System.out.println("Minimalna liczba z tablicy  " + Arrays.toString(array) +
                        " to-> " + num);
            }
        }
    }
    public static void maxValue(int[] array) {
        OptionalInt mini = Arrays.stream(array).max();
        for (int num : array) {
            if (mini.getAsInt() == num) {
                System.out.println("Maksymalna liczba z tablicy " + Arrays.toString(array) +
                        " to-> " + num);
            }
        }
    }
}
