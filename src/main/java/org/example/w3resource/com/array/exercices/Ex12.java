package org.example.w3resource.com.array.exercices;

public class Ex12 {
    //     Write a Java program to find duplicate values in an array of integer values.
    public static void main(String[] args) {
        int[] numbers = {2, 3, 9, 7, 1, 500, -5, -8, 12, 33, 3, -8, 1};
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if ((numbers[i] == numbers[j]) && (i != j)) {
                    System.out.println(numbers[i]);
                }
            }
        }

    }
}
