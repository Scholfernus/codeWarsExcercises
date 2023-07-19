package org.example.codeWars;

import java.util.Arrays;

public class CountTheMonkeys {
    public static int[] monkeyCount(final int n){
            int[]finalArray = new int[n];
        for (int i = 0; i < n; i++) {
            finalArray[i] = i+1;
        }return finalArray;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(monkeyCount(5)));
    }
}
