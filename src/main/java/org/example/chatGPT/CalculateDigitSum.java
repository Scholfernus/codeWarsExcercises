package org.example.chatGPT;

import java.util.Scanner;

public class CalculateDigitSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj dowolną liczbę wielocyfrową: ");
        int number = scanner.nextInt();
        System.out.println(calculateDigitSum(number));
    }

    public static int calculateDigitSum(int number) {
        int sum = 0;
        while (number > 0) {
            int temp = number % 10;
            sum += temp;
            number = number / 10;
        }
        return sum;
    }
}
