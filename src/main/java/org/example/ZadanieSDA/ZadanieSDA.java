package org.example.ZadanieSDA;

import java.util.Arrays;

public class ZadanieSDA {
    public static void main(String[] args) {
        int[][] numbers = new int[][]{{0, 1, 2}, {3, 4, 5}};
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                for (var n : numbers) {
                    System.out.printf("numbers[%d][%d] = %d ", i, j, i);
                }
                System.out.println();
            }
        }
        System.out.println(Arrays.toString(numbers));
    }
}

