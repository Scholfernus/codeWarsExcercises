package org.example.CodeWars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class EvenNumbers {
    public static int[] divisibleBy(int[] numbers, int divider) {
        List<Integer> result = new ArrayList<>();
        for (int number : numbers) {
            if (number % divider == 0) {
                result.add(number);
            }
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(divisibleBy(new int[]{1, 2, 3, 4, 5, 6}, 2)));
    }
}
