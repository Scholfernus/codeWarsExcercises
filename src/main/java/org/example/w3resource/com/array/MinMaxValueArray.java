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
class Exercise10 {

    static int max;
    static int min;

    public static void max_min(int my_array[]) {
        max = my_array[0];
        min = my_array[0];
        int len = my_array.length;
        for (int i = 1; i < len - 1; i = i + 2) {
            if (i + 1 > len) {
                if (my_array[i] > max) max = my_array[i];
                if (my_array[i] < min) min = my_array[i];
            }
            if (my_array[i] > my_array[i + 1]) {
                if (my_array[i] > max) max = my_array[i];
                if (my_array[i + 1] < min) min = my_array[i + 1];
            }
            if (my_array[i] < my_array[i + 1]) {
                if (my_array[i] < min) min = my_array[i];
                if (my_array[i + 1] > max) max = my_array[i + 1];
            }
        }
    }

    public static void main(String[] args) {
        int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        max_min(my_array);
        System.out.println(" Original Array: "+Arrays.toString(my_array));
        System.out.println(" Maximum value for the above array = " + max);
        System.out.println(" Minimum value for the above array = " + min);
    }
}