package org.example.CodeWars;

import java.util.Arrays;

public class SumWithoutHighestAndLowestNumber {
    public static int sum(int[] numbers) {
        if (numbers == null || numbers.length < 3) {
            return 0;
        }
        int result = 0;
        Arrays.sort(numbers);
        for (int i = 1; i < numbers.length-1; i++) {
            result += numbers[i];
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(sum(new int[] { 6, 2, 1, 8, 10}));
    }
}
