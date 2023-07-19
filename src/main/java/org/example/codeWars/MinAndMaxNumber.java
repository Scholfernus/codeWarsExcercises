package org.example.codeWars;

import java.util.Arrays;

public class MinAndMaxNumber {
    public static void main(String[] args) {
        int[]numbers = {44,15};
        System.out.println(Arrays.toString(minMaxArr(Arrays.toString(numbers))));
    }
    public static int[] minMaxArr(String arr) {
        int[]minMax = new int[2];
       Arrays.sort(minMax);
        return minMax;
    }
}
