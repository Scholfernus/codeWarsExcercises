package org.example.chatGPTzadania;

import java.util.Arrays;

public class SumTwoArrays {
    public static void main(String[] args) {
        int[]a = new int[]{1,2,3,4};
        int[]b = new int[]{5,6,7,8};
        int[]c = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < b.length; j++) {
                c[i] = a[i] + b[j];
                break;
            }
        }
        System.out.println(Arrays.toString(c));
    }
}
