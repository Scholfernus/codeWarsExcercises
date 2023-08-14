package org.example.w3resource.com.array;

import java.util.ArrayList;
import java.util.Arrays;

public class ConvertArrayToArrayList {
    public static void main(String[] args) {
        int[] num = {2, 1, 45, 6, 4, 9, -12, 5, 12, 16, 11, 3, 7, 8, 100, -3, 6, 4, 2, 15};
        convertArray(num);
    }

    public static void convertArray(int[] array) {
        System.out.println(Arrays.toString(array));
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 0) {
                numbers.add(array[i]);
            }
        }
        System.out.println(numbers);
    }
}
