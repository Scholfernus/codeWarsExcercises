package org.example.chatGPTzadania;

import java.util.Random;
import java.util.Scanner;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        System.out.println("Zgadnij wylosowaną liczbę z zakresu 0 do 100");
        Random random = new Random();
        int guess = random.nextInt(101);
        Scanner scanner = new Scanner(System.in);
        int attempts = 0;

        while (true) {
            int number = scanner.nextInt();
            attempts++;

            if (number == guess) {
                System.out.printf("Bingo, you've got it! Zgadłeś za %d razem%n", attempts);
                break;
            } else if (number > guess) {
                System.out.println("Podana przez Ciebie liczba jest większa od wylosowanej");
            } else {
                System.out.println("Podana przez Ciebie liczba jest mniejsza od wylosowanej");
            }
        }
    }
}
