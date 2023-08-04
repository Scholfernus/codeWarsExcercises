package org.example.w3resource.com.javaBasics;

import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj dowlną liczbę z zakresu od 0 do 1000: ");
        int number = scanner.nextInt();
        String value = String.valueOf(number);
        char[] array = value.toCharArray();
        for (char c : array) {
            sum += Character.getNumericValue(c);
        }
        System.out.println("Suma liczby " + number + " wynosi " + sum);
    }
}

//        int firstDigit = number % 10;
//        int remainingNumber = number / 10;
//        int SecondDigit = remainingNumber % 10;
//        remainingNumber = remainingNumber / 10;
//        int thirdDigit = remainingNumber % 10;
//        remainingNumber = remainingNumber / 10;
//        int fourthDigit = remainingNumber % 10;
//        int sum = thirdDigit + SecondDigit + firstDigit + fourthDigit;
//        System.out.println("The sum of all digits in " + num + " is " + sum);