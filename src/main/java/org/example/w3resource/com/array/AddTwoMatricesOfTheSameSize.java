package org.example.w3resource.com.array;

import java.util.Arrays;

public class AddTwoMatricesOfTheSameSize {
    public static void main(String[] args) {
        int[] array1 = {-1, 4, 0, 2, 7, -3};
        int[] array2 = {11, 6, 10, 8, 3, 13};
        int[] array3 = new int[array1.length];
        sumOfTwoArrays(array1,array2);

    }

    public static void sumOfTwoArrays(int[] a, int[] b) {
        int[] c = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i] + b[i];
        }
        System.out.println(Arrays.toString(c));
    }
}
