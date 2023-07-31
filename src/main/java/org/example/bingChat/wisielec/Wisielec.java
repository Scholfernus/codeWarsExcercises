package org.example.bingChat.wisielec;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Wisielec {
    public static void main(String[] args) {
        StringBuilder falseLetters = new StringBuilder("Błędne litery: ");
        List<String> words = List.of("java", "python", "csharp", "c++", "script");
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String word;
        System.out.println(words);
        word = words.get(random.nextInt(words.size()));
        char[] userWord = new char[word.length()];
        for (int i = 0; i < word.length(); i++) {
            userWord[i] = '-';
        }
        while (!gameOver(word, userWord)) {
            System.out.println(userWord);
            System.out.print("Podaj dowolną literę: ");
            char s = scanner.nextLine().toLowerCase().charAt(0); // Pobranie pierwszego znaku (litery)
            if (containsLetter(String.valueOf(userWord), s)) {
                System.out.println("Ta litera już została podana. Spróbuj inną.");
            } else {
                boolean found = false;
                for (int i = 0; i < word.length(); i++) {
                    if (word.charAt(i) == s) {
                        userWord[i] = s;
                        found = true;
                    }
                }

                if (!found) {
                    System.out.println(falseLetters.append(s).append(", "));
                }
            }
        }
    }

    private static boolean containsLetter(String str, char letter) {
        for (char c : str.toCharArray()) {
            if (c == letter) {
                return true;
            }
        }
        return false;
    }
    private static boolean gameOver(String word, char[] userWord) {
        if (isCorrect(userWord)) {
            System.out.println("Gratulacje! Odgadłeś słowo !!!");
            System.out.println("To słowo to: " + word);
            return true;
        } else if (isLoose(userWord)) {
            System.out.println("Niestety, przegrałeś. Szukane słowo to: " + word);
            return true;
        }
        return false;
    }

    private static boolean isCorrect(char[] userWord) {
         for (char c : userWord) {
            if (c == '-') {
                return false;
            }
        }
        return true;
    }

    private static boolean isLoose(char[] userWord) {
        int numberOfIncorrectWords = 0;
        for (char c : userWord) {
            if (c == '-') {
                numberOfIncorrectWords++;
            }
        }
        return numberOfIncorrectWords >= 12;
    }
}
