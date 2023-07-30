package org.example.bingChat.wisielec;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Wisielec {
    public static void main(String[] args) {
        StringBuilder falseLetter = new StringBuilder("Błędne litery: ");
        List<String> words = List.of("java", "python", "csharp", "c++", "script");
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String word;
        System.out.println(words);
        word = words.get(random.nextInt(words.size()));
        char[] userWords = new char[word.length()];

        while (gameOver()) {
            for (int i = 0; i < word.length(); i++) {
                userWords[i] = '-';
            }
        }
        System.out.println(userWords);
        System.out.print("Podaj dowolną literę:");
        char s = scanner.next().charAt(0);
        for (int i = 0; i < userWords.length; i++) {
            if (word.contains(String.valueOf(s))) {
                userWords[i] = s;
            } else {
                falseLetter.append(" s");
            }
        }

    }

    private static boolean gameOver() {
//        System.out.println("Hello World");
        return false;
    }
}
