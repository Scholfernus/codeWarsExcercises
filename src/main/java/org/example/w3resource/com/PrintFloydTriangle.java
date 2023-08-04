package org.example.w3resource.com;

import java.util.Scanner;

public class PrintFloydTriangle {
    public static void main(String[] args) {
        int a = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ilość rzędów: ");
        int row = scanner.nextInt();
        for (int i = 1; i <= row; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(a++ + " ");
            }
            System.out.println();
        }
    }
}
