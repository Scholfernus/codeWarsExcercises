package org.example.blokiCwiczenie;

import java.util.Scanner;

public class CzyParzysta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj dowolną liczbę");
        int a = scanner.nextInt();
        if (a%2 == 0){
            System.out.printf("liczba %d jest parzysta", a);
        }else {
            System.out.printf("liczba %d jest nieparzysta", a);
        }
    }
}
