package org.example.w3resource.com.recursiveMethods;

import java.util.Scanner;

public class SumOfNumbers {
    private static int sumOfDigits(int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += i;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj zakres liczb: ");
        int n = scanner.nextInt();
        System.out.println("Suma wszystkich liczb od 0 do " + n + " równa się: " + sumOfDigits(n));
    }
}
