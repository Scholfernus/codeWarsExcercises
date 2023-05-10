package org.example.chatGPTanotherExc;

import java.util.Scanner;

public class Exc1FizzBuzz {
    //Napisz program, który pobiera od użytkownika liczbę n a następnie wypisuje na ekran wszystkie liczby
    // od 1 do n, ale zamiast liczb podzielnych przez 3 wypisuje "Fizz",zamiast liczb podzielnych
    // przez 5 wypisuje "Buzz",a zamiast liczb podzielnych przez 3 i 5 wypisuje "FizzBuzz".
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj dowolną liczbę: ");
        int n = scanner.nextInt();
        for (int i = 0; i <= n; i++) {
            // System.out.println(i);
            if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
