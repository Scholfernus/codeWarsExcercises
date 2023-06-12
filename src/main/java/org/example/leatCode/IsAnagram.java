package org.example.leatCode;

import java.util.Arrays;

public class IsAnagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "nagaram"));
    }

    public static boolean isAnagram(String s, String t) {
        char[] word1 = s.toCharArray();
        char[] word2 = t.toCharArray();
        Arrays.sort(word1);
        Arrays.sort(word2);
        String s1 = String.valueOf(word1);
        String s2 = String.valueOf(word2);
        return s1.equals(s2);
    }
}