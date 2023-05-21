package org.example.chatGPT;

import java.util.Scanner;

public class ExerNumbers {
    public static void main(String[] args) {
        ExerNumbers exerNumbers = new ExerNumbers();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj dowolną liczbę całkowitą skłądającą się z kilku cyfr: ");
        int numbers = exerNumbers.calculateDigitSum(scanner.nextLine());
        System.out.printf("Suma wszystkich liczb wynosi %d", numbers);
    }

    public int calculateDigitSum(String numbersToCalculate) {
        int sum = 0;
        char[] charsNumb = numbersToCalculate.toCharArray();
        for (var elem : charsNumb) {
            int i = Character.getNumericValue(elem);
            sum += i;
        }
        return sum;
    }
}
//Napisz program, który przyjmuje od użytkownika liczbę całkowitą dodatnią i
// oblicza sumę cyfr tej liczby. Na przykład, dla liczby 123 program powinien
// zsumować 1 + 2 + 3, co daje wynik 6.