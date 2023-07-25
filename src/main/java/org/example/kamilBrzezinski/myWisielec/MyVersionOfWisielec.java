package org.example.kamilBrzezinski.myWisielec;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class MyVersionOfWisielec {
    char[] userWord;
    String word;
    int lives = 5;
    List<String> words = List.of("kot", "pies", "lis", "ptak");

    public void playTheGame() {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        word = words.get(random.nextInt(words.size()));
        userWord = new char[word.length()];

        for (int i = 0; i < word.length(); i++) {
            userWord[i] = '-';
        }
//        Arrays.fill(userWord, '-');
        while (!gameOver()) {
            System.out.println(userWord);
            System.out.println();
            System.out.println("Podaj kolejną literę: ");
            System.out.printf("Pozostało Ci %d żyć:\n", lives);

            char letter = scanner.nextLine().charAt(0);
            checkLetter(letter);
        }
        scanner.close();
    }


    private void checkLetter(char letter) {
        boolean foundLetter = false;
        for (int i = 0; i < userWord.length; i++) {
            if (word.charAt(i) == letter) {
                userWord[i] = letter;
                foundLetter = true;
            }
        }
        if (!foundLetter) {
            System.out.println("Podałeś niepoprawną literę.");
            lives--;
        }
    }

    private boolean gameOver() {
        return lives == 0 || word.equals(String.valueOf(userWord));
    }
}
