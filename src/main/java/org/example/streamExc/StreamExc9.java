package org.example.streamExc;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExc9 {
    public static void main(String[] args) {
        // Napisz program, który użyje strumienia (Stream) do
        // przetworzenia tej listy i zwróci sumę wszystkich liczb większych niż 10
        List<Integer>numbers = Arrays.asList(5, 12, 8, 20, 15, 3, 10, 18,15);
        int sum = numbers.stream().filter(n -> n > 10).mapToInt(Integer::intValue).sum();
        System.out.println(sum);
    }
}
