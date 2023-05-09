package org.example.chatGPTzadania;

import java.util.ArrayList;
import java.util.Scanner;

public class Exc4_Liczby_Pierwsze {
    public static void main(String[] args) {
        // Napisz program, który znajduje wszystkie liczby pierwsze w
        // przedziale od 1 do n (gdzie n jest pobierane od użytkownika).
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę n: ");
        int n = scanner.nextInt();
        ArrayList<Integer> primes = new ArrayList<Integer>();
        for (int i = 2; i <= n; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0){
                    isPrime = false;
                    break;
                }
            }
            if (isPrime){
                primes.add(i);
            }
        }
        System.out.println("Liczby pierwsze w przedziale 2 do " + n + ": ");
        for (int prime : primes) {
            System.out.println(prime + " ");
        }
    }
}
