package org.example.bingChat;

import java.util.Arrays;

public class ReplaceFirstAndLastLetter {
    public static void main(String[] args) {
        System.out.println(afterChange("java"));
    }
    public static String afterChange(String toChange) {
        if (toChange.length() >= 2) {
            char[] word = toChange.toCharArray();
            char temp = word[0];
            word[0] = word[word.length - 1];
            word[word.length - 1] = temp;
            String stringFinal = new String(word);
            return stringFinal;
        } else {
            return toChange;
        }
    }
}
//Napisz program, który zamienia pierwszą i ostatnią literę w danym stringu.
// Na przykład, string “java” powinien zostać zamieniony na “avaj”.
// Jeśli string ma mniej niż dwie litery, nie zmieniaj go.