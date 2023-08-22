package org.example.w3resource.com.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class FindSpecificWord {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("program", "to", "implement", "lambda", "expression", "calculate", "sum");
        String search = "lambda";
        Predicate<String> containsWord = word -> word.equals(search);
        boolean isIt = words.stream().anyMatch(containsWord);
        boolean lambda = words.contains("go");
        System.out.println(isIt);
        System.out.println(lambda);
    }
}
