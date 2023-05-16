package org.example.streamExc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExc8 {
    public static void main(String[] args) {
        // Napisz program, który użyje strumienia (Stream) do przetworzenia tej listy i
        // zwróci nową listę, w której nazwy kolorów są zamienione na ich długości.

        List<String> colors = Arrays.asList("Red", "Green", "Blue", "Yellow", "Orange");

        List<Integer> collect = colors.stream().map(String::length).collect(Collectors.toList());
        System.out.println(collect);
    }
}
