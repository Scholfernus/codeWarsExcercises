package org.example.w3resource.com.recursiveMethods;

import java.util.Scanner;

public class IsPalindrome {
    private static boolean isPalindrome(String word) {
        boolean check = false;
        for (int i = 0; i < word.length() / 2; i++) {
            if (word.charAt(0) == word.charAt(word.length() - 1)) {
                return true;
            } else {
                System.out.println(word + " nie jest palindromem.");
            }
        }
        return check;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj dwolne słowo: ");
        String word = scanner.nextLine();
        System.out.println("Czy słowo " + word + " jest palindromem ? -> "+ isPalindrome(word));
        String remainingSubstring = word.substring(1, word.length() - 1);
        System.out.println(remainingSubstring);
    }
}
// // Base case: an empty string or a string with one character is a palindrome
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
//
//  public static void main(String[] args) {
//    String palindrome1 = "madam";
//    boolean isPalindrome1 = isPalindrome(palindrome1);
//    System.out.println(palindrome1 + " is a palindrome: " + isPalindrome1);
//
//    String palindrome2 = "level";
//    boolean isPalindrome2 = isPalindrome(palindrome2);
//    System.out.println(palindrome2 + " is a palindrome: " + isPalindrome2);
//
//    String notPalindrome = "java";
//    boolean isPalindrome3 = isPalindrome(notPalindrome);
//    System.out.println(notPalindrome + " is a palindrome: " + isPalindrome3);
//  }