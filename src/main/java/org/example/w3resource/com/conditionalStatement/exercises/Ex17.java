package org.example.w3resource.com.conditionalStatement.exercises;

import java.util.Scanner;

public class Ex17 {
    //     Write a program in Java to make such a pattern like a right angle triangle with a number which repeats a
    //     number in a row.
    //    The pattern is as follows :
    //
    //1
    //22
    //333
    //4444
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number of rows : ");
        int numb = scanner.nextInt();
        for (int i = 1; i <= numb; i++) {
            // Pętla wewnętrzna do drukowania liczby i na każdym miejscu w wierszu
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            // Przejście do nowej linii po zakończeniu każdego wiersza
            System.out.println();
        }
    }
}
