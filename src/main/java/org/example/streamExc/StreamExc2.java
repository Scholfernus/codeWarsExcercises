package org.example.streamExc;

import java.util.List;

public class StreamExc2 {
    //Załóżmy, że mamy listę łańcuchów znaków i chcemy wydrukować na ekranie długości wszystkich
    // łańcuchów z tej listy, które są krótsze niż 5 znaków.
    // Napisz kod przy użyciu strumienia w Javie, który rozwiąże to zadanie.
    public static void main(String[] args) {


        List<String> words = List.of("drzewo", "pień", "korzeń", " las", "mrowisko", "osa", "lis", "pies");
        words.stream()
                .filter(w -> w.length() < 5)
                .mapToInt(String::length)
                .forEach(System.out::println);
    }
}