package org.example.chatGPT;

import java.util.Scanner;

public class IlorazOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj 1 liczbę i wciśnij enter:");
        int firstNumber = scanner.nextInt();
        System.out.println("Podaj 2 liczbę i wciśnij enter:");
        int secondNumber = scanner.nextInt();
        if (firstNumber % secondNumber == 0) {
            System.out.println(firstNumber + " jest podzielna przez " + secondNumber);
        } else {
            System.out.println(firstNumber + " nie jest podzielna przez " + secondNumber);
        }
    }
}
