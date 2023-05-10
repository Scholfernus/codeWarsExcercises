package org.example.chatGPTanotherExc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Exc4minMax {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(5,6,26,-15,33,12,10,8,3,-25));
        Integer min = Collections.min(numbers);
        Integer max = Collections.max(numbers);
        System.out.println(min + " " + max);
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers2 = new ArrayList<>();

        System.out.println("Podaj listę liczb (po jednej liczbie naciśnij ENTER, zakończ wprowadzanie wpisując 'koniec'): ");
        String input = scanner.next();
        while (!input.equals("koniec")) {
            try {
                int number = Integer.parseInt(input);
                numbers2.add(number);
            } catch (NumberFormatException e) {
                System.out.println("Wprowadzono niepoprawną liczbę, spróbuj ponownie.");
            }
            input = scanner.next();
        }

        if (numbers2.isEmpty()) {
            System.out.println("Nie wprowadzono żadnych liczb.");
        } else {
            Integer min2 = Collections.min(numbers);
            Integer max2 = Collections.max(numbers);
            System.out.println("Najmniejsza liczba: " + min2);
            System.out.println("Największa liczba: " + max2);
        }
    }
}
