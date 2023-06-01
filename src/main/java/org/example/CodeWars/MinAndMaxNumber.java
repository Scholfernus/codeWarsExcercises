package org.example.CodeWars;

import java.util.Arrays;

public class MinAndMaxNumber {
    public static void main(String[] args) {
        int[]numbers = {44,15};
        System.out.println(numbers);
    }
    public static int[] minMaxArr(int[] arr) {
        int[]minMax = new int[2];
       Arrays.sort(minMax);
        return minMax;
    }
}
