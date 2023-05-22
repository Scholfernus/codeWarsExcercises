package org.example.chatGPT;

import java.util.Arrays;
import java.util.Scanner;

public class TheBiggestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj 3 liczby");
        int[] theBiggest = new int[3];
        for (int i = 0; i < 3; i++) {
            theBiggest[i] = scanner.nextInt();
        }
        Arrays.sort(theBiggest);
        System.out.println("Największa liczba to: " + theBiggest[2]);
    }
}
