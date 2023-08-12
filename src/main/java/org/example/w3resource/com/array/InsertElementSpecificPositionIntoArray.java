package org.example.w3resource.com.array;

import java.util.Arrays;

public class InsertElementSpecificPositionIntoArray {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Before: " + Arrays.toString(numbers));
        insertElem(99, 8, numbers);
        System.out.println("After:  " + Arrays.toString(numbers));
    }

    public static void insertElem(int number, int index, int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[index] = number;
        }
    }
}
