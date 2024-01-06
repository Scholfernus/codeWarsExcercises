package org.example.w3resource.com.recursiveMethods.exercises;

import java.util.Scanner;

public class Ex6 {
    //    Write a Java recursive method to reverse a given string.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj dowolne słowo: ");
        String word = scanner.nextLine();
        String reversed = reverseString(word);
        System.out.println(reversed);
    }

    private static String reverseString(String word) {
        if (word.length() == 1) {
            return word;
        }
        return reverseString(word.substring(1))+ word.charAt(0);
    }
}