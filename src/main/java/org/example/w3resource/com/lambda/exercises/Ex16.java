package org.example.w3resource.com.lambda.exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class Ex16 {
    //    Write a Java program to implement a lambda expression to check if a list of strings contains a specific word.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj jakiego słowa szukasz: ");
        String word = scanner.nextLine();
        List<String> colorsList = Arrays.asList("red", "green", "blue", "black", "pink", "yellow", "white", "violet");
        Stream<String> searchingWord = colorsList.stream().filter(str -> str.equals(word));
        if (searchingWord.findAny().isPresent()){
            System.out.println("Słowo " + word + " występuje w liście.");
            searchingWord.forEach(System.out::println);
        }else {
            System.out.println("Słowo " + word + " nie występuje w liście.");
        }
    }
}
