package org.example.codeWars;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListFiltering {
    public static void main(String[] args) {
        List<Object> stringsAndNumbers = new ArrayList<>(List.of(1, 2, "a", "b"));
        List<Integer> filteredList = filterList(stringsAndNumbers);
        System.out.println(filteredList);
    }
    public static List<Integer> filterList(final List<Object> list) {
       return list.stream()
                .filter(obj -> obj instanceof Integer)
               .map(o -> (Integer) o)
               .collect(Collectors.toList());
    }
}
