package org.example.w3resource.com.array;

import java.util.Arrays;

public class FindCommonElementsBetweenTwoArrays {
    public static void main(String[] args) {
        int[] a = {1, 2, 2, 4, 10, 6};
        System.out.println(Arrays.toString(a));
        int[] b = {7, 8, 9, 10, 11, 3};
        System.out.println(Arrays.toString(b));
        commonElem(a, b);
    }

    public static void commonElem(int[] a, int[] b) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    System.out.println("Taki sam element: " + a[i]);
                }
            }
        }
    }
}
