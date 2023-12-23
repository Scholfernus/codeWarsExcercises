package org.example.w3resource.com.basic1.from1to50;

import java.util.Scanner;

public class Ex49 {
    // Write a Java program to accept a number and check whether
    // the number is even or not. Prints 1 if the number is even or 0 if odd.
    public static void main(String[] args) {
        System.out.println("Podaj dowolną liczbę, 1 to liczba parzysta, 0 to liczba nieparzysta:");
        Scanner scanner = new Scanner(System.in);
        int numb = scanner.nextInt();
        if (numb % 2 != 0) {
            System.out.println(0);
        } else {
            System.out.println(1);
        }
    }
}
