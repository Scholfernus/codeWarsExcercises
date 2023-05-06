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
    }
    public static Map<String,Integer>countOccurrences(List<String>list){
        Map<String,Integer> counts = new HashMap<>();
        for (String element : list) {
            if (!counts.containsKey(element)){
                counts.put(element,1);
            }else {
                counts.put(element, counts.get(element)+1);
            }
        }
        return counts;
    }
}
