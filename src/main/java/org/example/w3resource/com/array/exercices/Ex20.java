package org.example.w3resource.com.array.exercices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex20 {
    //    Write a Java program to convert an array to an ArrayList
    public static void main(String[] args) {
        int[] arr = {2, 3, 9, 7, 1, 500, 5, 8, 12, 33, 1};
        System.out.println(Arrays.toString(arr));
        List<Integer> list = new ArrayList<>();
        for (int numb:arr) {
            list.add(numb);
        }
        System.out.println(list);
    }
}
