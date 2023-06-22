package org.example.bingChat;

import java.util.Scanner;

public class PrintHelloWorld {
    public static void main(String[] args) {
        String invitation = "Hello World! ";
        System.out.println("Ile razy wyświetlić napis?: Wpisz liczę między 1 a 10");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        // Walidacja danych wejściowych
        if (number < 1 || number > 10) {
            System.out.println("Błędna liczba. Spróbuj ponownie.");
            return;
        }
        // Użycie pętli for zamiast while
        for (int i = 1; i <= number; i++) {
            // Użycie metody println zamiast print
            System.out.println(invitation);
        }
    }
}
