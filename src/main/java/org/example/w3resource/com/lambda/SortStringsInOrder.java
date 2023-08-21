package org.example.w3resource.com.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortStringsInOrder {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>(List.of("Mama", "Tata", "Ciocia", "Wujek", "Kuzyn", "Siostra"));
        List<String> sortedList = words.stream().sorted().collect(Collectors.toList());
        sortedList.forEach(System.out::println);
        List<String> colors = Arrays.asList("red", "green", "blue", "black", "pink");

        // Print the Original list of strings
        System.out.println("Original strings:");
        for (String str : colors) {
            System.out.print(str + ' ');
        }
        colors.sort((str1, str2) -> str1.compareToIgnoreCase(str2));
        System.out.println("\nSorted strings:");
        for (String str : colors) {
            System.out.print(str + ' ');
        }
    }
}
