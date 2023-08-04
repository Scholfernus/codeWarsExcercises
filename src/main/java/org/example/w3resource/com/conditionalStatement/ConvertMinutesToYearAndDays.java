package org.example.w3resource.com.conditionalStatement;

import java.util.Scanner;

public class ConvertMinutesToYearAndDays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę minut: ");
        long minutes = scanner.nextLong();
        long hours = minutes / 60;
        long days = (hours / 24) % 365;
        int years = (int) (minutes/(60*24*365));
        System.out.println(minutes + " minut, to " + years + " lat i " + days + " dni.");
    }
}
