package org.example.w3resource.com.basic1.from1to50;

import java.util.Scanner;

public class Ex33 {
    //Write a Java program and compute the sum of an integer's digits
    public static void main(String[] args) {
        System.out.println("Podaj dowolną liczbę wielocyfrową");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        String value = String.valueOf(number);
        char[] array = value.toCharArray();
        int sum1 = 0;
        for (char digitChar : array) {
            int value1 = Character.getNumericValue(digitChar);
            sum1 += value1;
        }
        System.out.println(sum1);

        int sum2 = 0;

        // Calculate the sum of the digits
        while (number != 0) {
            sum2 += number % 10;
            number /= 10;
        }
        System.out.println(sum2);
    }
}

