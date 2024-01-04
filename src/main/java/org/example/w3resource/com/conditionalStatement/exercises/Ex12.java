package org.example.w3resource.com.conditionalStatement.exercises;

import java.util.Scanner;

public class Ex12 {
    //    Write a program in Java to input 5 numbers from the keyboard and find their sum and average.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj 5 dowolnych liczb: ");
        int sum = 0;
        double average = 0;
        for (int i = 0; i < 5; i++) {
            sum += scanner.nextInt();
        }
        average = (double) sum / 5;
        System.out.println("Suma podanych liczb wynosi -> " + sum);
        System.out.println("Średnia podanych liczb wynosi -> " + average);
    }
}
