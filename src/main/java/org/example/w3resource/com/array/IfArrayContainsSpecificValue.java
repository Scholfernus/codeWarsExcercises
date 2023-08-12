package org.example.w3resource.com.array;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class IfArrayContainsSpecificValue {
    public static void main(String[] args) {
        int[] numbers = {1, 12, 5, 6, 9, 1, 8, 33};
        String[] words = {"eye", "leg", "corp", "elbow", "head", "finger"};
        char[] chars = {'a', 'g', 'h', 'r', 's', 'K'};
        int target = 1;
        String word = "leg";
        char sign = 'F';
        boolean containsNumber = containsNumber(numbers, target);
        boolean equalsWord = Arrays.stream(words).anyMatch(w -> w.equals(word));
        boolean charIs = containsValue(chars, sign);
        if (containsNumber) {
            System.out.println("Array contains the target value-> " + target);
        } else {
            System.out.println("Array does not contain the target value-> " + target);
        }
        if (equalsWord) {
            System.out.println("Array contains the target value-> " + word);
        } else {
            System.out.println("Array does not contain the target value-> " + word);
        }
        if (charIs) {
            System.out.println("Array contains the target value-> " + sign);
        } else {
            System.out.println("Array does not contain the target value-> " + sign);
        }
    }

    private static boolean containsValue(char[] array, char target) {
        for (char value : array) {
            if (value == target) {
                return true;
            }
        }
        return false;
    }

    public static boolean containsNumber(int[] array, int number) {
        for (int num : array) {
            if (num == number) {
                return true;
            }
        }
        return false;
    }
}
