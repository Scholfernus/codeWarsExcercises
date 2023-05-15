package org.example.streamExc;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExc7 {
    // Wybierz imiona zaczynające się na "M", zamień na małe litery i posortuj
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Marta", "Adam", "Monika", "Marcin", "Anna", "Michał");
        List<String> modifiedNames = names.stream().filter(s -> s.startsWith("M"))
                .map(s -> s.toLowerCase()).sorted()
                .collect(Collectors.toList());
        System.out.println(modifiedNames);
    }

}
