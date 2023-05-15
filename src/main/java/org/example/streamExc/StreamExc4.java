package org.example.streamExc;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExc4 {
    // Załóżmy, że masz listę napisów (String) i chcesz wyfiltrować tylko te napisy, które zaczynają się od litery "A"
    // i mają długość większą niż 3 Następnie chcesz posortować te napisy alfabetycznie. Moje zadanie dla Ciebie
    // polega na napisaniu kodu, który wykona te operacje przy użyciu strumieni.
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Apple", "Banana", "Avocado", "Pear", "Apricot", "Orange");
        List<String> collect = strings.stream().filter(s -> s.startsWith("A"))
                .filter(s -> s.length() > 3)
                .sorted().collect(Collectors.toList());
        System.out.println(collect);
    }
}
