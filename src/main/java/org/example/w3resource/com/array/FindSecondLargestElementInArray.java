package org.example.w3resource.com.array;

import java.util.Arrays;

public class FindSecondLargestElementInArray {
    public static void main(String[] args) {
        int[] numbers = {2, 1, 45, 6, 4, 9, -12, 5, 12, 16, 11, 3, 7, 8, 100, 3, 6, 4, 2, 15};
        int second = second(numbers);
        System.out.println("Drugim pod względem wartości elementem tablicy jest: " + second);
    }

    public static int second(int[] array) {
        Arrays.sort(array);
        int sec = 0;
        System.out.println(Arrays.toString(array));
        if (array.length >= 2) {  // Ensure there are at least two elements in the array
            sec = array[array.length - 2];  // Access the second-to-last element
        }
        return sec;
    }
}
