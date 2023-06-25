package org.example.bingChat;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapCountryPeople {
    public static void main(String[] args) {
        Map<String, Integer> countries = new HashMap<>();
        countries.put("Polska",38);
        countries.put("Niemcy",83);
        countries.put("Francja",67);
        countries.put("Włochy",60);
        countries.put("Hiszpania",47);
        System.out.println(countries);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj nazwę kraju: ");
        String land = scanner.nextLine();
        if (countries.containsKey(land)){
            int people = countries.get(land);
            System.out.println("Liczba ludności w " + land + " wynosi " + people + " milionów");
        }else {
            System.out.println("Nie ma takiego kraju.");
        }
    }
}
