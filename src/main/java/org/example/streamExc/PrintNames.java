package org.example.streamExc;

import java.util.*;

public class PrintNames {
    public static void main(String[] args) {
        Set<String> uniqueNames = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj dowolne imiona (wpisz '-' aby zakończyć): ");
        while (true) {
            String name = scanner.nextLine().toLowerCase();
            if (name.equals("-")) {
                break;
            }
            uniqueNames.add(name);
        }
        System.out.println("Liczba unikalnych imion: " + uniqueNames.size());
    }
}
