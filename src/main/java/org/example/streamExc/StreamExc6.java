package org.example.streamExc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class StreamExc6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Napisz 3 wyrazów: ");
        List<String>words = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            words.add(scanner.nextLine());
        }
        Object[] objects = words.toArray();
        System.out.println(words);
    }
}
