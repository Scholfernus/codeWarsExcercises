package org.example.w3resource.com.array;

import java.util.Arrays;

public class AddDoubleArrayOfTheSameSize {
    public static void main(String[] args) {
        int sum = 0;
        int[][] a = {{4, 5, 6, 7, 8}, {6, 5, 4, 3, 2}};
        System.out.println(Arrays.deepToString(a));
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                sum += a[i][j] + a[1][j];
            }
            break;
        }
        System.out.println(sum);
    }
}
