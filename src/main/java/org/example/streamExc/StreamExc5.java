package org.example.streamExc;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExc5 {
    public static void main(String[] args) {

        List<String>writing = new ArrayList<>(List.of("Anna","Agata", "Amelia","Renata", "Monika","Eleonora"));

        List<String> collect = writing.stream().filter(s -> s.length() > 5)
                .filter(s -> s.startsWith("A"))
                .collect(Collectors.toList());
        System.out.println(collect);
    }
}
