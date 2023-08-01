package org.example.w3resource.com;

import java.util.Scanner;

public class WhichNumberIsTheBiggest {
    public static void main(String[] args) {
        int max = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę: ");
        int num1 = input.nextInt();
        System.out.println("Podaj drugą liczbę: ");
        int num2 = input.nextInt();
        System.out.println("Podaj trzecią liczbę: ");
        int num3 = input.nextInt();
        if (num1 > num2 && num1 > num3) {
            max = num1;
        } else if (num2 > num1 && num2 > num3) {
            max = num2;
        } else {
            max = num3;
        }
        System.out.println("Największą liczbą jest: " + max);
    }
}

// 3. Write a Java program that takes three numbers from the user and prints the greatest number.
