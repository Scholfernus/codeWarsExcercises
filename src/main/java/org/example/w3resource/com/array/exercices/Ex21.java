package org.example.w3resource.com.array.exercices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex21 {
    //    Write a Java program to convert an ArrayList to an array.
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(2, 3, 9, 7, 1, 500, 5, 8, 12, 33, 1));
        int[]numbers = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            numbers[i] = list.get(i);
        }
        System.out.println(Arrays.toString(numbers));
    }
}
