package org.example.w3resource.com.basic1.from101to150;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex132 {
    //    Write a Java program to find the updated length of a given sorted array where duplicate elements appear at most twice.
//Original array: [1, 1, 2, 3, 3, 3, 4, 5, 6, 7, 7, 7, 7]
    public static void main(String[] args) {
        int[] numbers = {1, 1, 2, 3, 3, 3, 4, 5, 6, 7, 7, 7, 7};
        System.out.println(Arrays.toString(numbers));
        System.out.println("Rozmiar tablicy wynosi: " + numbers.length);
        List<Integer> unique = new ArrayList<>();
        for (int num:numbers) {
            if (!unique.contains(num)){
                unique.add(num);
            }
        }
        System.out.println(unique);
        System.out.println("Rozmiar listy wynosi: " + unique.size());
    }
}
