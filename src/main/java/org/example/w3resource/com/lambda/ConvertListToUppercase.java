package org.example.w3resource.com.lambda;

import java.util.ArrayList;
import java.util.List;

public class ConvertListToUppercase {
    public static void main(String[] args) {
        List<String>words = new ArrayList<>(List.of("Abracadabra", "Lion","Tiger","Scott"));
        System.out.println("Original strings: ");
        for (String str :words) {
            System.out.println(str);
        }
        words.replaceAll(s -> s.toLowerCase());
        System.out.println("\nLowercase strings: ");
        for (String str :words) {
            System.out.println(str);
        }
        words.replaceAll(s -> s.toUpperCase());
        System.out.println("\nUpperCase strings: ");
        for (String str :words) {
            System.out.println(str);
        }
    }
}
