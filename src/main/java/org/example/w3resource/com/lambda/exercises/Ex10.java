package org.example.w3resource.com.lambda.exercises;

import java.util.function.BiFunction;

public class Ex10 {
    //    Write a Java program to implement a lambda expression to concatenate two strings.
    public static void main(String[] args) {
        String word1 = "Łączenie";
        String word2 = " wyrazów.";
        String concat = word1.concat(word2);
        System.out.println(concat);

        BiFunction<String, String, String> concatenate = (str1, str2) -> str1 + str2;
        String string = concatenate.apply(word1, word2);
        System.out.println(string);
    }
}
