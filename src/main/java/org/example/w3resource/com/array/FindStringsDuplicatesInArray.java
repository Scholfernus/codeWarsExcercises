package org.example.w3resource.com.array;

import java.util.Arrays;

public class FindStringsDuplicatesInArray {
    public static void main(String[] args) {
        String[] check = {"dog", "cat", "mouse", "Fox", "bird", "snake", "chicken", "wolf", "fox"};
        findString(check);
        String[] check2 = {"dog", "cat", "mouse", "Fox", "bird", "snake", "chicken", "dog", "wolf", "fox"};
        findString2(check2);
    }

    public static void findString(String[] words) {
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].toLowerCase().equals(words[j])) {
                    System.out.println("I found similar word: " + words[i]);
                }
            }
        }
    }

    public static void findString2(String[] words) {
        Arrays.sort(words,String.CASE_INSENSITIVE_ORDER);
        for (int i = 1; i < words.length; i++) {
            if (words[i].equalsIgnoreCase(words[i - 1])) {
                System.out.println("I found similar word: " + words[i]);
            }
        }
    }
}
