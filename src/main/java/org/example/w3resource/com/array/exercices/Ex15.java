package org.example.w3resource.com.array.exercices;

public class Ex15 {
    //    Write a Java program to find common elements between two integer arrays.
    public static void main(String[] args) {
        int[] numbers = {2, 3, 9, 7, 1, 500, -5, -8, 12, 33};
        int[] numbers2 = {1, 500, 33};
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers2.length; j++) {
                if (numbers[i] == numbers2[j]) {
                    System.out.print(numbers[i] + ", ");
                }
            }
        }
    }
}
