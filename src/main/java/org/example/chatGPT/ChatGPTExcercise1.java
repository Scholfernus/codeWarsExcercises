package org.example.chatGPT;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ChatGPTExcercise1 {
    // Napisz metodę, która przyjmuje jako argument listę obiektów i zwraca mapę,
    // której kluczami są unikalne elementy z listy,
    // a wartościami liczba wystąpień tych elementów w liście.
    public static void main(String[] args) {
        List<String> elements = new ArrayList<>();
        elements.add("foo");
        elements.add("bra");
        elements.add("baz");
        elements.add("bar");
        elements.add("foo");
        elements.add("fog");
        elements.add("baz");
        elements.add("foo");
        Map<String, Integer> counts = countOccurrences(elements);
        System.out.println(counts);
        print();
        String hello = "Witaj ";
        String world = "Świecie!";
        String powitanie = hello + world; //łączenie dwóch napisów
        System.out.println(powitanie);

        String czesc = powitanie.substring(0, 6) + "uczniu";
        System.out.println(czesc);
        int a = 5;
        int b = 3;
        int c = a + b++; //c = a + b, a dopiero później b = b + 1;
        System.out.println(c);
        c = (a++) + b; //c = a + b, a następnie a = a + 1
        System.out.println(c);
        int x = ++a;
        System.out.println(x);

    }

    public static Map<String, Integer> countOccurrences(List<String> list) {
        Map<String, Integer> counts = new HashMap<>();
        for (String element : list) {
            if (!counts.containsKey(element)) {
                counts.put(element, 1);
            } else {
                counts.put(element, counts.get(element) + 1);
            }
        }
        return counts;
    }

    public static void print() {
        System.out.println(1 + 2 + 3 + " Dodawanie");
        System.out.println("Dodawanie " + 1 + 2 + 3);
    }
}


