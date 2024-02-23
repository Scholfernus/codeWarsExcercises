package org.example.bingChat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AddTwiceDivideSub {
    public static void main(String[] args) {
        Add(5, 10);
        Sub(5, 10);
        Twice(5, 10);
        Divide(5, 10);
        List<Integer> numbers = new ArrayList<>(List.of(1,2,3,4,5,6));
        List<Integer> numbers2 = Arrays.asList(1,2,3,4,5,6);
        List<Integer> collect = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(collect);
        int sum = numbers2.stream()
                .filter(n -> n % 2 == 0)
                .mapToInt(n -> n * 2)
                .sum();
        System.out.println("Suma liczb wynosi: " + sum);
        List<String>names = Arrays.asList("John", "Alice", "Bob", "Charlie");
        names.forEach(name-> System.out.println("Hello "+name));
    }

    static void Add(int a, int b) {
        int addResult = a + b;
        System.out.printf("Suma liczb %d i %d = %d\n", a, b, addResult);
    }

    static void Sub(int a, int b) {
        int subResult = a - b;
        System.out.printf("Różnica liczb %d i %d = %d\n", a, b, subResult);
    }

    static void Twice(int a, int b) {
        int twiceResult = a * b;
        System.out.printf("Iloczyn liczb %d i %d = %d\n", a, b, twiceResult);
    }

    static void Divide(double a, double b) {
        double divideResult = (double) a / b;
        System.out.printf("Iloraz liczb %.0f i %.0f = %.2f", a, b, divideResult);
    }
}
