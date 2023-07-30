package org.example.bingChat.wisielec;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Wisielec {
    public static void main(String[] args) {
        List<String> words = List.of("java", "python", "csharp", "c++", "script");
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String word;
        System.out.println(words);
        char[] userWords = new char[]{};

        while (!gameOver()) {
            word = words.get(random.nextInt(words.size()));
            for (int i = 0; i < word.length(); i++) {
                userWords[i] = '-';
            }
            System.out.print("Podaj dowolną literę:");
        }
    }

    private static boolean gameOver() {
        System.out.println("Hello World");
        return false;
    }
}
