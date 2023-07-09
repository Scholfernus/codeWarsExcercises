package org.example.ZadanieSDA;

import java.util.Arrays;

public class TwoArrayExercise {
    public static void main(String[] args) {
        int[][] numbers = new int[][]{{0, 1, 2}, {3, 4, 5}};
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.printf("numbers[%d][%d] = %d \n", i, j, numbers[i][j]);
            }
            System.out.println();
        }

        System.out.println(Arrays.toString(numbers));
    }
}


