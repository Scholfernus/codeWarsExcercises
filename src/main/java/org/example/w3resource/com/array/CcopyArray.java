package org.example.w3resource.com.array;

import java.util.Arrays;

public class CcopyArray {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] b = new int[a.length];
        copy(a, b);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }

    public static void copy(int[] a, int[] b) {
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }
    }
}
