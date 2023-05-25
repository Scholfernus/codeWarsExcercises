package org.example.chatGPTanotherExc;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

//Znajduje największą liczbę z listy.
//Znajduje najmniejszą liczbę z listy.
//Sortuje listę w kolejności rosnącej.
//Usuwa duplikaty z listy.
public class ListExercise {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę całkowitą: wpisz dowolną literę, aby zakończyć. ");
        while (scanner.hasNextInt()) {
            numbers.add(scanner.nextInt());
        }
        System.out.println(numbers); // Wyświetla wszystkie liczby z listy.
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        int max = Integer.MIN_VALUE;
        for (int m : numbers) {
            if (m > max) {
                max = m;
            }
        }
        int min = Integer.MAX_VALUE;
        for (int m : numbers) {
            if (m < min) {
                min = m;
            }
        }
        numbers.sort(null);
        Set<Integer>uniqueNumbers = new HashSet<>(numbers);
        List<Integer> collect = numbers.stream().distinct().collect(Collectors.toList());
        System.out.println("Największa liczba to: " + max);
        System.out.println("Najmniejsza liczba to: " + min);
        System.out.println("Suma liczb wynosi : " + sum); // Oblicza sumę wszystkich liczb z listy
        System.out.println("Posortowana liczba: " + numbers);
        System.out.println("Lista bez duplikatów: " + uniqueNumbers);
    }
}
