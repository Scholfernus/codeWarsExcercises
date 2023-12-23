package org.example.w3resource.com.basic1.from51to100;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Ex60 {
    // Write a Java program to find the penultimate (next to the last) word in a sentence.
    // Input a String: The quick brown fox jumps over the lazy dog.
    //Penultimate word: lazy
    public static void main(String[] args) {
        String findWord = "The quick brown fox jumps over the lazy dog.";
        String[] split = findWord.split(",");
        Object[] array = Arrays.stream(split).toArray();
        System.out.println(array[array.length - 1]);
    }
}
