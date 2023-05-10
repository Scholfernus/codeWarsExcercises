package org.example.chatGPTanotherExc;

import java.util.Scanner;

public class Exc2Suma_Roznica {
    public static void main(String[] args) {
        System.out.println("Podaj dowolną liczbę: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println("Podaj dowolną liczbę: ");
        int b = scanner.nextInt();
        int sum, minus, divide, multi = 0;
        sum = a + b;
        minus = a - b;
        divide = a / b;
        multi = a * b;
        if (b != 0) {
            divide = a / b;
            System.out.println(sum + ", " + minus + ", " + divide + ", " + multi);
        } else {
            System.out.println("Nie można dzielić przez zero!");
            System.out.println(sum + " " + minus + " " + multi);
        }
    }
}
