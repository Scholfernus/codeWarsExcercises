package org.example.chatGPT;

import java.util.Map;
import java.util.Scanner;

public class FirstNumberBoolean {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj dowolną cyfrę sprawdzę czy to jest liczba pierwsza: ");
        int number = scanner.nextInt();
        if (number < 2) {
            System.out.println("Liczba musi być większa od 2");
        }
        boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime){
            System.out.printf("Liczba %d jest liczbą pierwszą", number);
        }else {
            System.out.printf("Liczba %d nie jest liczbą pierwszą", number);

        }
    }
}
