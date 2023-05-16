package org.example.streamExc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class StreamExc11 {

    // Napisz program, który przyjmuje od użytkownika listę wyrazów (String),
    // a następnie zwraca listę wyrazów, które składają się z samych małych liter oraz mają nieparzystą liczbę liter.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> input = new ArrayList<>();
        System.out.println("Podaj 6 różnych wyrazów: ");
        for (int i = 0; i < 6; i++) {
            input.add(scanner.nextLine());
        }
        List<String> collectWords = input.stream()
                .filter(w -> w.length() % 2 != 0 && Character.isLowerCase(w.charAt(0)))
                .collect(Collectors.toList());
        System.out.println(collectWords);
    }
}
