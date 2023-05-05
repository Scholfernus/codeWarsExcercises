package org.example.blokiCwiczenie;

import java.sql.SQLOutput;
import java.util.Scanner;

public class SimpleExcercice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj dowolną wartość do obliczenia pola kwadratu:");
        int x = scanner.nextInt();
        while (x > 0) {
            int pole = x * x;
            System.out.printf("Pole kwadratu o boku %d cm wynosi %d cm kw.", x, pole);
            break;
        }
        if (x <= 0)
            System.out.println("Podałeś nieprawidłową liczbę.");
        else System.out.println("\nKoniec programu");
    }
}
