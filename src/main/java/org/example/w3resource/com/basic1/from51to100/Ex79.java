package org.example.w3resource.com.basic1.from51to100;

import java.util.Arrays;

public class Ex79 {
    //     Write a Java program to rotate an array (length 3) of integers in the left direction
    public static void main(String[] args) {
        int[] origin = {20, 30, 40};
        int[] rotated = {origin[1], origin[2], origin[0]};
        System.out.println(Arrays.toString(origin));
        System.out.println(Arrays.toString(rotated));
    }
}
