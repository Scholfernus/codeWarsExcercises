package org.example.w3resource.com.recursiveMethods;

public class ReverseString {
    public static void main(String[] args) {
        String word = "Abracadaber";
        System.out.println("Odwrócone słowo to: " + reverse(word));
    }

    private static String reverse(String word) {
        if (word.isEmpty() || word.length() == 1) {
            return word;
        }
        StringBuilder sb = new StringBuilder(word);
        String reversedString = sb.reverse().toString();
        return reversedString;
    }
}
