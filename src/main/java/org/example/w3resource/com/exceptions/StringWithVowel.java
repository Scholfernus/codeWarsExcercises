package org.example.w3resource.com.exceptions;

import java.lang.invoke.StringConcatException;
import java.util.Scanner;

public class StringWithVowel {
    public static void main(String[] args) {
        try {
            String text = "Java handling and managing exceptions ";
            // String text = "Typy gyps fly.";
            System.out.println("Origi string: " + text);
            checkVowels(text);
            System.out.println("String contains vowels.");
        }catch (NoVowelsException e){
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void checkVowels(String word) throws NoVowelsException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input some word: ");
        String check = scanner.nextLine();
        boolean containsVowels = check.contains("a") || check.contains("e") ||
                check.contains("i") || check.contains("u") ||
                check.contains("o");
        if(!containsVowels){
            throw new NoVowelsException("String does not contain any vowels.");
        }
    }
}

class NoVowelsException extends Exception {
    public NoVowelsException(String message) {
        super(message);
    }
}
