package org.example.w3resource.com.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertArrayListToArray {
    public static void main(String[] args) {
        ArrayList<String> countries = new ArrayList<>(List.of("Germany", "Poland", "France", "USA", "Spain"));
        System.out.println(countries);
        countries.remove(1);
        convertArray(countries);
    }

    public static void convertArray(ArrayList<String> words) {
        Object[] array = words.toArray();
//        int index = 0;
//        String[] phrases = new String[words.size()];
//        while (index < words.size()) {
//            for (String s : words) {
//                phrases[index] = s;
//                index++;
//            }
//        }
        System.out.println(Arrays.toString(array));
    }
}
