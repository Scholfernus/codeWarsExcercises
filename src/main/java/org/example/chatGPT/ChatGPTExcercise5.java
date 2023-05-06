package org.example.chatGPT;

import java.util.ArrayList;
import java.util.List;

public class ChatGPTExcercise5 {
    public static void main(String[] args) {
        // Sprawdzanie, czy lista zawiera elementy innej listy
        List<Object> list1 = new ArrayList<>();
        list1.add("zero");
        list1.add(0);
        list1.add(true);
        list1.add(new ArrayList<>());
        list1.add(5);
        List<Object> list2 = new ArrayList<>();
        list2.add("zero");
        list2.add(0);
        list2.add(true);
        list2.add(new ArrayList<>());
        list2.add(5);
        System.out.println(doesExist(list1, list2));
    }
    public static boolean doesExist(List<Object> o1, List<Object> o2) {
        boolean contains = o2.containsAll(o1);
        return contains;
    }
}
