package org.example.chatGPTzadania;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Exc5_Dlugosc_Wyrazu {
    //Napisz program, który pobiera od użytkownika listę napisów i sortuje je według długości napisów.
    public static void main(String[] args) {
        Scanner inputWords = new Scanner(System.in);
        List<String> countWordLength = new ArrayList<>();
        List<Integer>wordLength = new ArrayList<>();
        System.out.println("Wpisz listę 6 wyrazów: ");
        for (int i = 0; i < 6; i++) {
            String word = inputWords.nextLine();
            countWordLength.add(word);
            wordLength.add(word.length());
        }
        Collections.sort(countWordLength, (a,b)->Integer.compare(a.length(), b.length()));
        System.out.println("Pososrtowane liczby według długości wyrazu: ");
        for (var v : countWordLength ) {
            System.out.println(v);
        }
    }
}
