package org.example.chatGPT;

import java.util.Scanner;

public class FirstNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj dowolną liczbę:");
        int number = input.nextInt();
        int i2 = (int) Math.sqrt(6);
        System.out.println(i2);
        if (number < 2) {
            System.out.println(number + " jest mniejsza od 1, liczba musi być większa od 1");
        }
        boolean isPrime = true;

        for (int i = 2; i < Math.sqrt(number); i++) {

            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println(number + " jest liczbą pierwszą");
        } else {
            System.out.println(number + " nie jest liczbą pierwszą");
        }
    }
}
