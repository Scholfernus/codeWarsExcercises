package org.example.w3resource.com;

import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input an alphabet: ");
        String input = in.next().toLowerCase();
        boolean lowerCase = input.charAt(0) >= 97 && input.charAt(0) <= 122;
        boolean vowel = input.equals("a")|| input.equals("e")||input.equals("o")
                ||input.equals("i")||input.equals("u");
        if (input.length()>1){
            System.out.println("Error. Not a single character.");
        } else if (vowel) {
            System.out.println("Input letter is Vowel");
        }else {
            System.out.println("Input letter is Consonant");
        }
    }
}

// Napisz program Java, który wymaga od użytkownika wprowadzenia jednego znaku z alfabetu.
// Drukuj samogłoskę lub spółgłoskę, w zależności od danych wprowadzanych przez użytkownika.
// Jeśli dane wejściowe użytkownika nie są literą (między a i z lub A i Z) lub są ciągiem o długości > 1,
// wydrukuj komunikat o błędzie.
//Dane testowe
//Input an alphabet: p
//Expected Output :
//Input letter is Consonant