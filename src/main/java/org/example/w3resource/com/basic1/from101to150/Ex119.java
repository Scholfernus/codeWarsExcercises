package org.example.w3resource.com.basic1.from101to150;

import java.util.Arrays;
import java.util.Scanner;

public class Ex119 {
    //    Write a Java program to get the first occurrence (Position starts from 0.) of an element of a given array.
    public static void main(String[] args) {
        int[] numbers = {10, 11, 10, 30, 45, 20, 33, 53};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Jakiej liczby szukasz: ");
        int target = scanner.nextInt();
        int firstOccurrence = findFirstOccurrence(numbers, target);
        System.out.println("Liczba znajdue się pod indeksem: " + firstOccurrence);
    }
    private static int findFirstOccurrence(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1; // Element not found
    }
}
