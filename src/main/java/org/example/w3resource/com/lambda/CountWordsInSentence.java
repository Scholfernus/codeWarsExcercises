package org.example.w3resource.com.lambda;

import java.util.Arrays;

public class CountWordsInSentence {
    public static void main(String[] args) {
        String phrase = "Write a Java program to implement a lambda expression to calculate the sum of squares of all odd and even numbers in a list";
        System.out.println("Original string: " + phrase);
        WordCounter wordCounter = s -> s.split("\\s+").length;
        int count = wordCounter.countWords(phrase);
        System.out.println("Word count: " + count);
        System.out.println(count);
        phrase = "The quick brown fox jumps over the lazy dog.";
        System.out.println("\nOriginal string: " + phrase);
        wordCounter = s -> s.split("\\s+").length;
        count = wordCounter.countWords(phrase);
        System.out.println("Word count: " + count);
        String[] s = phrase.split(" ");
        int ile = s.length;
        System.out.println(ile);
    }

    @FunctionalInterface
    interface WordCounter {
        int countWords(String text);
    }
}
