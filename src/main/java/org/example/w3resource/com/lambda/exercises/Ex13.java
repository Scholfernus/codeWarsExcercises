package org.example.w3resource.com.lambda.exercises;

import java.util.Arrays;
import java.util.List;

public class Ex13 {
    //    Write a Java program to implement a lambda expression to count words in a sentence.
    public static void main(String[] args) {
        String sentence = "W tym kodzie, metoda reduce() jest używana do pomnożenia wszystkich elementów w liście liczb " +
                "całkowitych. Wartość początkowa 1 jest używana jako pierwszy argument w wywołaniu metody reduce(). " +
                "Wyrażenie lambda (a, b) -> a * b jest używane do pomnożenia dwóch kolejnych elementów w strumieniu. " +
                "Wynik jest wyświetlany za pomocą metody println().\nMam nadzieję, że to pomogło!";
        List<String> words = Arrays.asList(sentence.split("\\s+"));
        long num = words.stream().count();
        System.out.println("The number of words in the sentence is: " + num);
    }
}
