package org.example.bingChat;

import java.util.*;

public class ListOfNumbers {
    public static void main(String[] args) {
    List<Integer> numbers = new ArrayList<>(10);
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int numb = random.nextInt(100)+ 1;
            numbers.add(numb);
        }
        Collections.sort(numbers);
        System.out.println(numbers);
    }
}
