package org.example.w3resource.com.basic1.from101to150;

import java.util.Arrays;

public class Ex103 {
    // Write a Java program to create an array from a given array of integers.
    // The newly created array will contain elements from the given array after the last element value is 10.
    public static void main(String[] args) {
        int counter = -1;
        int[] numbers = {10, 11, 10, 30, 45, 20, 33, 53};
        System.out.println(Arrays.toString(numbers));

        // Znajdź indeks ostatniego wystąpienia liczby 10
        for (int i = numbers.length - 1; i >= 0; i--) {
            if (numbers[i] == 10) {
                counter = i;
                break;
            }
        }

        // Sprawdź, czy znaleziono liczbę 10
        if (counter != -1) {
            // Utwórz nową tablicę o odpowiedniej długości
            int[] newArray = new int[numbers.length - counter - 1];

            // Przypisz wartości do nowej tablicy
            for (int i = 0; i < newArray.length; i++) {
                newArray[i] = numbers[counter + 1 + i];
            }

            // Wyświetl nową tablicę
            System.out.println(Arrays.toString(newArray));
        } else {
            System.out.println("Brak liczby 10 w tablicy.");
        }
    }
}


