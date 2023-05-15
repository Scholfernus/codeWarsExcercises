package org.example.streamExc;

import java.util.ArrayList;
import java.util.List;

public class StreamExc3 {
    // Załóżmy, że masz listę liczb całkowitych.
    // Twoim zadaniem jest wyfiltrowanie tylko liczb parzystych i pomnożenie ich przez 2.
    // Następnie policz sumę tych przemnożonych liczb.
    public static void main(String[] args) {
        List<Integer> numb = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        int sum = numb.stream()
                .filter(n -> n % 2 == 0)
                .mapToInt(i -> i * 2)
                .sum();
        System.out.println(sum);
    }
}
