package org.example.bingChat;

import java.util.Scanner;

public class Silnia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long suma = 1;
        System.out.println("Podaj liczbę całkowitą - obliczę jej silnię: ");
        int number = scanner.nextInt();
        if (number==0){
            suma =1;
        } else if (number<0) {
            System.out.println("Liczba nie może być ujemna!");
        }
        for (int i = 1; i < number; i++) {

            suma *= i;
        }
        System.out.printf("Silnia liczby %d wynosi %d.",number,suma);
    }
}
