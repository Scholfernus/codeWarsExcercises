package org.example.chatGPTzadania.methods;

import java.util.HashSet;
import java.util.Set;

public class FindTheSameNumberInArray {
    public static void main(String[] args) {
        int[] checkNumbers = {1, 2, 3, 4, 5, 2};
        System.out.println(containsDuplicates(checkNumbers));
        System.out.println(containsDuplicates2(checkNumbers));
    }

    public static boolean containsDuplicates(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean containsDuplicates2(int[] numbers) {
        Set<Integer> set = new HashSet<>();
        for (int num : numbers) {
            if (set.contains(num)) {
                return true;
            }
            set.add(num);
        }
        return false;
    }
}
