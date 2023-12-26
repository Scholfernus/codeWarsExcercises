package org.example.w3resource.com.basic1.from101to150;

import java.util.Scanner;

public class Ex108 {
    //    Write a Java program to add all the digits of a given positive integer until the result has a single digit.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę składającą się z conajmniej 2 elementów:");
        int number = scanner.nextInt();
        int digit = addDigitsUntilSingleDigit(number);
        System.out.println(digit);
    }

    private static int addDigitsUntilSingleDigit(int num) {
       while (num>=10) {
           int sum = 0;
           while (num > 0) {
               sum += num % 10;
               num = num / 10;
           }
           num = sum;
       }
        return num;
    }
}
