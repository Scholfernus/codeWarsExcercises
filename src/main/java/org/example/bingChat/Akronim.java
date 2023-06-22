package org.example.bingChat;

import java.util.Arrays;

public class Akronim {
    public static void main(String[] args) {
        String phrase = "To jest zdanie do weryfikacji";
        String acronim = "";
        String[] split = phrase.toUpperCase().split(" ");
        for (String word : split) {
            acronim += word.charAt(0);
        }
        System.out.println(acronim);
    }
}
