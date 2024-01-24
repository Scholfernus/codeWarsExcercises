package org.example.w3resource.com.genericMethods.exercises;

import java.util.HashMap;
import java.util.Map;

public class Ex7 {
    //    Write a Java program to create a generic method that takes a map of any type and prints each key-value pair.
    public static <K, V> void printEachValuePair(Map<K, V> values) {
        for (Map.Entry<K, V> entry : values.entrySet()) {
            K key = entry.getKey();
            V value = entry.getValue();
            System.out.println("Key: " + key + ", Value: " + value);
        }
    }

    public static void main(String[] args) {
        Map<String, Integer> capitalMap = new HashMap<>();
        capitalMap.put("Berlin", 1);
        capitalMap.put("Athens", 2);
        capitalMap.put("Paris", 3);
        printEachValuePair(capitalMap);

        Map<String, String> capitalCountries = new HashMap<>();
        capitalCountries.put("Berlin", "BRD");
        capitalCountries.put("Athens", "Greece");
        capitalCountries.put("Paris", "France");
        printEachValuePair(capitalCountries);
    }
}
