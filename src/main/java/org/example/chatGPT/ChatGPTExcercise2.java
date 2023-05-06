package org.example.chatGPT;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ChatGPTExcercise2 {
    // {3,15,-12,8,10,65, -24,-15,1}
    // Sortowanie listy liczb
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(15);
        numbers.add(-12);
        numbers.add(8);
        numbers.add(10);
        numbers.add(65);
        numbers.add(-24);
        numbers.add(-15);
        System.out.println(sortedList(numbers));
    }

    public static List<Integer> sortedList(List<Integer> putNumbers) {
        Collections.sort(putNumbers);
        return putNumbers;
    }
}
