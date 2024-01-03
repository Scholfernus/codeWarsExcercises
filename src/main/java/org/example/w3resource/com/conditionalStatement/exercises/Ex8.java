package org.example.w3resource.com.conditionalStatement.exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex8 {
    //    Write a Java program that requires the user to enter a single character from the alphabet.
//    Print Vowel or Consonant, depending on user input. If the user input is not a letter (between a and z or A and Z),
//    or is a string of length > 1, print an error message.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj dowolną literę: ");
        String letter = scanner.nextLine();
        List<String> Vowel = new ArrayList<>(List.of("a", "e", "i", "o", "u", "y"));
        for (String string : Vowel) {
            if (letter.equals(string)) {
                System.out.println(letter + " is Vowel");
                break;
            } else if (!(letter.equals(string))) {
                System.out.println(letter + " is Consonant");
                break;
            }else {
                System.out.println("Error");
            }
        }
    }
}
