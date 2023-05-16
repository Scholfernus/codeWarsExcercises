package org.example.streamExc;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.Scanner;
import java.util.stream.IntStream;

public class StreamExc10 {

    // Napisz program, który wczyta od użytkownika listę liczb całkowitych
    // i wykorzystując strumienie obliczy:
    // * średnią arytmetyczną liczb podzielnych przez 3,
    // * iloczyn liczb nieparzystych większych od 5,
    // * sumę kwadratów liczb parzystych.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> liczby = new ArrayList<>();
        System.out.println("Podaj dowolnych 7 liczb całkowite, obliczę średnią liczb większych od 3");
        for (int i = 0; i < 7; i++) {
            liczby.add(scanner.nextInt());
        }
        OptionalDouble average = liczby.stream()
                .filter(n -> n % 3 == 0)
                .mapToDouble(n -> n)
                .average();
        Integer reduce = liczby.stream()
                .filter(n -> n > 5 && n % 2 != 0)
                .reduce(1, (a, b) -> a * b);
        int sum = liczby.stream()
                .filter(n -> n % 2 == 0)
                .mapToInt(n -> n * n).sum();
        System.out.println(average);
        System.out.println(reduce);
        System.out.println(sum);
    }
}

