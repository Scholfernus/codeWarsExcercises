package org.example.chatGPT;

import java.util.Scanner;

public class IsPalindrom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj dowolne słowo sprawdzę czy jest Palindromem: ");
        String text = scanner.nextLine();

        System.out.println("Czy " + text + " jest palindromem? " + isPalindrom(text));
    }

    public static boolean isPalindrom(String input) {
        for (int i = 0; i < input.length() / 2; i++) {
            if (input.charAt(i) == input.charAt(input.length() - 1 - i)) {
                return true;
            }
        }
        return false;
    }
}