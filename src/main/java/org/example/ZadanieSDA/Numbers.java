package org.example.ZadanieSDA;

import java.util.ArrayList;
import java.util.List;


public class Numbers {
    public static void main(String[] args) {
        List<Integer> num = new ArrayList<>(List.of(1, 3, 4, 10, 9, 13, 6));
        num.stream()
                .filter(s -> s % 2 != 0)
                .map(s -> s * 100)
                .forEach(System.out::println);
    }
}
// zamiast stream może być parallelstream