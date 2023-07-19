package org.example.zadanieSDA;

import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PrintNamesSecondVersion {
    public static void main(String[] args) {
        Set<String> uniqueNames = new HashSet<>();
        Multiset<String> countNames = HashMultiset.create();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj dowolne imiona (wpisz '-' aby zakończyć): ");
        while (true) {
            String name = scanner.nextLine().toLowerCase();
            if (name.equals("-")) {
                break;
            }
            uniqueNames.add(name);
            countNames.add(name);
        }

        System.out.println("Liczba unikalnych imion: " + uniqueNames.size());
        System.out.println("Liczba wystąpień poszczególnych imion:");
        for (String name : uniqueNames) {
            System.out.println(name + ": " + countNames.count(name));
        }
    }
}
