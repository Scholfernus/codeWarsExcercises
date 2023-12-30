package org.example.w3resource.com.basic1.from101to150;

import java.util.ArrayList;
import java.util.List;

public class Ex138 {
    //    Write a Java program to find the longest words in a dictionary.
    public static void main(String[] args) {
        List<String> words = new ArrayList<>(List.of("cat", "flag", "green", "country", "w3resource"));
        int maxLength = 0;
        List<String> longestWords = new ArrayList<>();

        for (String word : words) {
            int length = word.length();
            if (length > maxLength) {
                maxLength = length;
                longestWords.clear();
                longestWords.add(word);
            } else if (length == maxLength) {
                // Jeżeli aktualne słowo ma taką samą długość jak najdłuższe dotychczasowe, dodaj do listy
                longestWords.add(word);
            }
        }
        System.out.println("Longest words: " + longestWords);
    }
}

