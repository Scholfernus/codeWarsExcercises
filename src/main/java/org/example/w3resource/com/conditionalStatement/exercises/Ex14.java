package org.example.w3resource.com.conditionalStatement.exercises;

import java.util.Scanner;

public class Ex14 {
    //    Write a Java program to display the multiplication table of a given integer.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę do obliczenia tabliczki mnożenia: ");
        int number = scanner.nextInt();
        for (int i = 0; i <= number; i++) {
            System.out.println(number + " x " + i + " = " + number * i);
        }

    }
}
