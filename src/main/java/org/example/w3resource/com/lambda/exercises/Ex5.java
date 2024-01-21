package org.example.w3resource.com.lambda.exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ex5 {
    //    Write a Java program to implement a lambda expression to sort a list of strings in alphabetical order.
    public static void main(String[] args) {
        List<String> words = new ArrayList<>(List.of("TOTO", "ABRA", "cadabra", "day", "night", "Midnight", "noon", "morning", "zazoo"));
        List<String> colorsList = Arrays.asList("red", "green", "blue", "black", "pink");
        System.out.println(colorsList);
        System.out.println(words);
        words.sort(String::compareToIgnoreCase);
        colorsList.sort(String::compareToIgnoreCase);
        System.out.println(words);
        System.out.println(colorsList);
    }
}
