package org.example.bingChat;

import java.util.Scanner;

public class IsPalindrom {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean isPalindrom = true;
        System.out.println("Podaj dowolne słowo: ");
        String word = scanner.nextLine();
        char[] array = word.toCharArray();
        for (int i = 0; i < array.length / 2; i++) {
            if (array[i] != array[array.length- i - 1]) {
                isPalindrom = false;
                break;
            }
        }
        System.out.printf("Czy słowo %s jest palindromem? %b", word, isPalindrom);
    }
}
