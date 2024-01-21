package org.example.w3resource.com.lambda.exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Ex4 {
    //    Write a Java program to implement a lambda expression to filter out even and odd numbers from a list of integers.
    public static void main(String[] args) {
        List<Integer> numb = new ArrayList<>(List.of(3, 5, -7, 5, 14, 12, 10, 9, 17));
        List<Integer> even = numb.stream().filter(integer -> integer % 2 == 0).sorted().collect(Collectors.toList());
        List<Integer> odd = numb.stream().filter(integer -> integer % 2 != 0).sorted().collect(Collectors.toList());
        System.out.println(numb);
        System.out.println(even);
        System.out.println(odd);
    }
}
