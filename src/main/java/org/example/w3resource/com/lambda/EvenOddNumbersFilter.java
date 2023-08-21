package org.example.w3resource.com.lambda;

import com.google.common.base.Supplier;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class EvenOddNumbersFilter {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 5, 2, 8, 6, 4, 9, 3, 1, 5, 45, 78, 11, 0, -4, -5};
        System.out.println(Arrays.toString(numbers));
        List<Integer> list = Arrays.asList(11, 23, 98, 34, 15, 32, 42, 80, 99, 100);
        for (var n : list) {
            System.out.print(n + " ");
        }
        System.out.println("\nLiczby parzyste.");
        List<Integer> evenNumbers = list.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        Supplier<IntStream> intStreamSupplier = () -> Arrays.stream(numbers).filter(i -> i % 2 == 0);
        IntStream evenStream = intStreamSupplier.get();
        int[] evenArray = evenStream.toArray();

        System.out.println("Liczby parzyste: " + Arrays.toString(evenArray));
        System.out.println("\nLiczby nieparzyste.");
        List<Integer> oddNumbers = list.stream().filter(n -> n % 2 != 0).collect(Collectors.toList());
        for (var n : oddNumbers) {
            System.out.print(n + " ");
        }
        System.out.println();
        System.out.println("Liczby parzyste: " + intStreamSupplier);
        Supplier<IntStream> streamSupplier = () -> Arrays.stream(numbers).filter(i -> i % 2 != 0);
        System.out.println("Liczby nieparzyste: " + streamSupplier);
    }
}
