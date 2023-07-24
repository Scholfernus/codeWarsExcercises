package org.example.kamilBrzezinski.wisielec;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Wisielec {
    List<String> words = List.of("lis", "pies", "kot", "myszka", "ptak", "kura", "kuropatwa");
    char[] userWord;
    String word;
    int lives = 3;

    public void play() {
        Scanner scanner = new Scanner(System.in);

        Random random = new Random();
        word = words.get(random.nextInt(words.size()));

        userWord = new char[word.length()];
        Arrays.fill(userWord, '_');
        while (!gameEnded()) {
            System.out.print(userWord);
            System.out.println();
            System.out.println("Podaj kolejną literę: ");
            System.out.printf("Pozostało Ci %d żyć\n",lives);

            char letter = scanner.nextLine().charAt(0);
            checkLetter(letter);
        }
        if (lives==0){
            System.out.println("Niestety nie udało Ci się wygrać.");
        }
        else {
            System.out.println("Gratulacje, wygrałeś");
        }
        scanner.close();
    }

    private void checkLetter(char letter) {
        boolean foundLetter = false;

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == letter) {
                userWord[i] = letter;
                foundLetter = true;
            }
        }
        if (!foundLetter) {
            System.out.println("Niestety nie ma takiej litery.");
            lives--;
        }
    }

    private boolean gameEnded() {
        return lives == 0 || word.equals(String.valueOf(userWord));
    }
}
