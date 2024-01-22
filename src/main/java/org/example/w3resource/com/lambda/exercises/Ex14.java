package org.example.w3resource.com.lambda.exercises;

import java.util.Scanner;

public class Ex14 {
    //    Write a Java program to implement a lambda expression to check if a given string is a palindrome.
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        boolean isPalindrome = false;
        System.out.println("Podaj dowolne słowo: ");
        while (!isPalindrome) {
            String word = scanner.nextLine();
            // Usuń spacje z wprowadzonego słowa
            String cleanedWord = word.replaceAll("\\s+", "");

            // Utwórz wyrażenie lambda sprawdzające, czy słowo jest palindromem
            PalindromeChecker palindromeChecker = (str) -> {
                String reversed = new StringBuilder(str).reverse().toString();
                return str.equalsIgnoreCase(reversed);
            };

            // Sprawdź, czy słowo jest palindromem
            isPalindrome = palindromeChecker.check(cleanedWord);

            if (!isPalindrome) {
                System.out.println("Podane słowo nie jest palindromem. Spróbuj ponownie.");
            } else {
                System.out.println("Podane słowo jest palindromem.");
            }
        }
    }

    // Interfejs funkcjonalny dla wyrażenia lambda
    interface PalindromeChecker {
        boolean check(String str);
    }
}
//public class Ex14 {
//    // Write a Java program to implement a lambda expression to check if a given string is a palindrome.
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Podaj dowolne słowo: ");
//        String string = scanner.nextLine();
//        boolean isPalindrome = true;
//        for (int i = 0; i < string.length() / 2; i++) {
//            if (string.charAt(i) != string.charAt(string.length() - i - 1)) {
//                isPalindrome = false;
//                break;
//            }
//        }
//        if (isPalindrome) {
//            System.out.println("Podany ciąg znaków jest palindromem.");
//        } else {
//            System.out.println("Podany ciąg znaków nie jest palindromem.");
//        }
//    }
//}