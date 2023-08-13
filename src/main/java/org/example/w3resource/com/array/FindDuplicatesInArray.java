package org.example.w3resource.com.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class FindDuplicatesInArray {
    public static void main(String[] args) {
        int[] numbers = {3, 5, 9, 1, 7, 9, 8, 3, 2, 4, 3, 8, 4};
        findDuplicates(numbers);
        System.out.println("Second solution.");
        findDuplicates2(numbers);
        System.out.println("Third solution.");
        findDuplicates3(numbers);
        System.out.println("Fourth solution.");
        findDuplicates4(numbers);
    }

    public static void findDuplicates(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j] && (i != j)) {
                    System.out.println("I find duplicate: " + array[i]);
                }
            }
        }
    }

    public static void findDuplicates2(int[] array) {
        Arrays.sort(array);
        for (int i = 1; i < array.length; i++) {
            if (array[i] == array[i - 1]) {
                System.out.println("I find duplicate: " + array[i]);
            }
        }
    }

    public static void findDuplicates3(int[] array) {
        HashSet<Integer> numbs = new HashSet<>();
        for (int num : array) {
            if (!numbs.add(num)) {
                System.out.println("I find duplicate: " + num);
            }
        }
    }

    public static void findDuplicates4(int[] array) {
        HashMap<Integer, Integer> hashNumbers = new HashMap<>();
        for (int num : array) {
            hashNumbers.put(num, hashNumbers.getOrDefault(num, 0) + 1);
        }
        for (int num : hashNumbers.keySet()) {
            if (hashNumbers.get(num) > 1) {
                System.out.println("Duplicate found: " + num +
                        " (count: " + hashNumbers.get(num) + ")");
            }
        }
    }
}

