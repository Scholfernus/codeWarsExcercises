package org.example.w3resource.com.exceptions;

import java.util.Arrays;

public class NumberIsOdd {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        oddNumber(numbers);
    }

    public static void oddNumber(int[] array) {
        int odd;
        for (int i = 0; i < array.length - 1; i++) {
            try {
                if (array[i] % 2 != 0) {
                    odd = array[i];
                    throw new RuntimeException("Number is odd. ");
                }
                oddNumber(array);
                return;
            } finally {
                System.out.println(Arrays.toString(array));
            }
        }
        return;
    }
}
class Exception_OddNumber {
    public static void main(String[] args) {
        int n = 18;
        tryNumber(n);
        n = 7;
        tryNumber(n);
    }

    public static void tryNumber(int n) {
        try {
            checkEvenNumber(n);
            System.out.println(n + " is even.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    public static void checkEvenNumber(int number) {
        if (number % 2 != 0) {
            throw new IllegalArgumentException(number + " is odd.");
        }
    }
}