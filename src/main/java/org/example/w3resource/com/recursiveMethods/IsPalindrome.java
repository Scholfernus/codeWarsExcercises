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
    }
}
