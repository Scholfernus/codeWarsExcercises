package org.example.codeWars;

import java.util.HashMap;
import java.util.Map;

public class CountCharactersInYourString {
    public static Map<Character, Integer> count(String str) {
        int count = 0;
        Map<Character, Integer> letters = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            letters.put(c, letters.getOrDefault(c,0)+1);
        }
        return letters;
    }

    public static void main(String[] args) {
        System.out.println(count("aabb"));
        System.out.println(count("aabbbac"));
        System.out.println(count("a"));
    }
}

//  Map<Character, Integer> charMap = new HashMap<>();
//
//        for (Character character : str.toCharArray()) {
//            if (charMap.containsKey(character)) {
//                charMap.put(character, charMap.get(character) + 1);
//            } else {
//                charMap.put(character, 1);
//            }
//        }
//        return charMap;
//    }

// Map<Character, Integer> letters = new HashMap<>();
//        for (char c : str.toCharArray()) {
//            letters.put(c, letters.getOrDefault(c, 0) + 1);
//        }
//        return letters;
//    }