package org.example.chatGPTzadania;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exc2_Napis {
    // Napisz program, który pobiera od użytkownika napis,
    // a następnie zlicza ilość wystąpień każdego znaku w napisie.
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        System.out.println("Wpisz dowolny napis, a ja zliczę ilość występujących znaków: ");
        String inscription = enter.nextLine();
        System.out.println(numberOfChar(inscription));
    }
    public static HashMap<Character, Integer> numberOfChar(String word){
//        char[] chars = word.toCharArray();
        HashMap<Character, Integer> lettersCount = new HashMap<>();
        for (char c : word.toCharArray()) {
            lettersCount.compute(c, (k,v)->(v==null)? 1 : v+1);
            lettersCount.compute(c,(key,value)->(value==null) ? 1 : value + 1);
        }
        for (Map.Entry<Character, Integer> entry : lettersCount.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        return lettersCount;
    }
}
