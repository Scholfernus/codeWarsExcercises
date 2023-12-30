package org.example.w3resource.com.basic1.from101to150;

import java.util.*;

public class Ex131 {
    //    Write a Java program to find the updated length of a sorted array where each element appears only once
//    (remove duplicates).Original array: [1, 1, 2, 3, 3, 3, 4, 5, 6, 7, 7] The length of the original array is:
//    11 After removing duplicates, the new length of the array is: 7
    public static void main(String[] args) {
        Integer[] originArray = {1, 1, 2, 3, 3, 3, 4, 5, 6, 7, 7};
//        List<Integer> list = new ArrayList<>(Arrays.asList(originArray));
        List<Integer> uniqueList = new ArrayList<>();
        for (int num : originArray) {
            if (!uniqueList.contains(num)) {
                uniqueList.add(num);
            }
        }
        Set<Integer> uniqueSet2 = new HashSet<>();
        uniqueSet2.addAll(Arrays.asList(originArray));
        // Dodaj unikalne elementy do setu
        uniqueSet2.addAll(Arrays.asList(originArray));
        System.out.println("Original array: " + Arrays.toString(originArray));
        System.out.println("The length of the original array is: " + originArray.length);
        System.out.println("After removing duplicates, the new length of the array is: " + uniqueList.size());
    }
}
