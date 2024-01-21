package org.example.w3resource.com.lambda.exercises;

import java.util.ArrayList;
import java.util.List;

public class Ex3 {
    //    Write a Java program to implement a lambda expression to convert a list of strings to uppercase and lowercase.
    public static void main(String[] args) {
        List<String> words = new ArrayList<>(List.of("ABRA", "cadabra", "day", "night", "Midnight", "noon", "morning"));
        System.out.println(words);
        words.replaceAll(str -> str.toUpperCase());
        System.out.println(words);
        words.replaceAll(str -> str.toLowerCase());
        System.out.println(words);
    }
}
