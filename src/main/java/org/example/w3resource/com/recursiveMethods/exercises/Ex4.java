package org.example.w3resource.com.recursiveMethods.exercises;

import java.util.Scanner;

public class Ex4 {
    //    Write a Java recursive method to check if a given string is a palindrome.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj dowolne słowo: ");
        String word = scanner.nextLine();
        boolean palindrome = isPalindrome(word);
        System.out.println("Czy słowo '" + word + "' to palindrom? " + palindrome);
    }

    private static boolean isPalindrome(String word) {
        for (int i = 0; i < word.length() / 2; i++) {
            if (word.charAt(i) != word.charAt(word.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
// public static boolean isPalindrome(String str) {
//    // Base case: an empty string or a string with one character is a palindrome
//    if (str.length() <= 1) {
//      return true;
//    }
//
//    // Recursive case: check if the first and last characters are equal,
//    // and recursively check if the substring between them is a palindrome
//    char firstChar = str.charAt(0);
//    char lastChar = str.charAt(str.length() - 1);
//
//    if (firstChar != lastChar) {
//      return false;
//    }
//
//    String remainingSubstring = str.substring(1, str.length() - 1);
//    return isPalindrome(remainingSubstring);
//  }