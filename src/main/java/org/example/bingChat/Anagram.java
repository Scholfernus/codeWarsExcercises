package org.example.bingChat;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("arak","kajak"));
    }
    public static boolean isAnagram(String first, String second){
        if (first.length()==second.length()) {
            char[] firstChar = first.toCharArray();
            char[] secondChar = second.toCharArray();
            Arrays.sort(firstChar);
            Arrays.sort(secondChar);
        return Arrays.equals(firstChar,secondChar);
        }
        else return false;
    }
}

// Napisz program, który sprawdza, czy dany string jest anagramem innego stringa,
// czyli czy zawiera te same litery w innej kolejności. Na przykład, string “kot”
// jest anagramem stringa “tok”, ale nie stringa “koc”
