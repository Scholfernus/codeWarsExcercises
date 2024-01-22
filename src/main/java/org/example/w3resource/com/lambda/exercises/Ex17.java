package org.example.w3resource.com.lambda.exercises;

import java.util.Arrays;
import java.util.List;

public class Ex17 {
    //    Write a Java program to implement a lambda expression to find the length of the longest and smallest string in a list.
    public static void main(String[] args) {
        List<String> colorsList = Arrays.asList("red", "green", "blue", "black", "pink", "yellow", "white", "violet", "purpleWhite");
        int max = colorsList.stream().mapToInt(String::length).max().orElse(0);
        System.out.println("The longest word has: " + max + " letters");
        int min = colorsList.stream().mapToInt(String::length).min().orElse(0);
        System.out.println("The shortest word has: " + min + " letters");

    }
}
