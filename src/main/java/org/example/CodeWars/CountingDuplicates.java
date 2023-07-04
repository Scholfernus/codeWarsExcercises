package org.example.CodeWars;

import java.util.HashMap;
import java.util.Map;

public class CountingDuplicates {
    public static int duplicateCount(String text) {
        Map<Character, Integer> collect = new HashMap<>();
        int count = 0;
        for (Character character : text.toLowerCase().toCharArray()) {
            if (collect.containsKey(character)) {
                collect.put(character, collect.get(character) + 1);
                if (collect.get(character)==2){
                    count++;
                }
            } else {
                collect.put(character, 1);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(duplicateCount("indivisibility"));
        System.out.println(duplicateCount("abcdea"));
        System.out.println(duplicateCount("abcde"));
        System.out.println(duplicateCount("gdsgdufkuyylyt"));
    }
}
