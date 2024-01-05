package org.example.w3resource.com.conditionalStatement.exercises;

import java.util.Scanner;

public class Ex29 {
    //    Write a Java program that reads an positive integer and count the number of digits the number
//    (less than ten billion) has.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj dowolną liczbę wielocyfrową: ");
        long longNumber = scanner.nextLong();
        String numbOfDigit = Long.toString(longNumber);
        char[] array = numbOfDigit.toCharArray();
        int lengthOfDigits = array.length;
        System.out.println("Liczba " + longNumber + " ma " + lengthOfDigits + " znaków.");
    }
}
//             long number = scanner.nextLong();
//             if (number > 0 && number < 10_000_000_000L) {
//            // Konwertuj liczbę na ciąg znaków, a następnie oblicz długość ciągu
//            int digitCount = String.valueOf(number).length();
//
//            // Wyświetl wynik
//            System.out.println("Liczba cyfr w liczbie: " + digitCount);
//        } else {
//            // Wyświetl komunikat o błędzie, jeśli liczba nie spełnia warunków
//            System.out.println("Podana liczba nie jest dodatnia lub przekracza dziesięć miliardów.");
//        }
//    }
//}