package org.example.blokiCwiczenie;

import java.util.Arrays;
import java.util.Scanner;

public class Blocks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj długość tablicy:");

        int n = scanner.nextInt();
        int[] tab1 = new int[n];
        for (int i = 0; i < n; i++) {
            tab1[i] = (int) (Math.random() * 20);
        }
        System.out.println(Arrays.toString(tab1));
        int i = 0;
        int j = 0;
        // while (j < n) {

        while (j < n - i - 1) {

            for (i = 0; i < n - 1; i++) {
                for (j = 0; j < tab1.length - 1; j++) {
                    if (tab1[j] > tab1[j + 1]) {
                        int temp = tab1[j];
                        tab1[j] = tab1[j + 1];
                        tab1[j + 1] = temp;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(tab1));
        System.out.println("Koniec programu");
    }
}
//}
