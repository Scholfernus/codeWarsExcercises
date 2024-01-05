package org.example.w3resource.com.conditionalStatement.exercises;

import java.util.Scanner;

public class Ex18 {
//    Write a Java program to make such a pattern like a right angle triangle with the number increased by 1.
public static void main(String[] args) {
    int k =1;
    Scanner scanner = new Scanner(System.in);
    System.out.print("Input number of rows : ");
    int numb = scanner.nextInt();
    for (int i = 1; i <= numb; i++) {
        // Pętla wewnętrzna do drukowania liczby i na każdym miejscu w wierszu
        for (int j = 1; j <= i; j++) {
            System.out.print(k++);
        }
        // Przejście do nowej linii po zakończeniu każdego wiersza
        System.out.println();
    }
}
}
