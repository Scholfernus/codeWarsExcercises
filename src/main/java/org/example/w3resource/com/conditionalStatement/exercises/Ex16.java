package org.example.w3resource.com.conditionalStatement.exercises;

import java.util.Scanner;

public class Ex16 {
    //    Write a Java program to display the pattern like a right angle triangle with a number.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number of rows : ");
        int numb = scanner.nextInt();
        for (int i = 1; i <=numb; i++) {
            System.out.println();
            for (int j = 1; j <=i ; j++) {
                System.out.print(j);
            }
        }

    }
}
