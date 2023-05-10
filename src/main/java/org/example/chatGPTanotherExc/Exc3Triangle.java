package org.example.chatGPTanotherExc;

import java.util.Scanner;

public class Exc3Triangle {
    // Napisz program, który pobiera od użytkownika liczbę n,
    // a następnie rysuje trójkąt równoboczny o wysokości n z gwiazdek.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj dowolną liczbę: ");
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k < i * 2 - 1; k++) {

                System.out.print("*");
            }
            System.out.println();
        }
    }
}
