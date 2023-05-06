package org.example.chatGPT;

import java.util.ArrayList;
import java.util.List;

public class ChatGPTExcercise4 {
    public static void main(String[] args) {
        // Łączenie dwóch list w jedną
        List<Object> element1 = new ArrayList<>();
        element1.add("Bike");
        element1.add("2");
        element1.add(15);
        element1.add(false);
        element1.add(new Object());
        element1.add(new ArrayList<>());
        List<Object> element2 = new ArrayList<>();
        element2.add("Car");
        element2.add("4");
        element2.add(100);
        element2.add(true);
        element2.add(new Object());
        element2.add(new ArrayList<>());
        System.out.println(concatList(element1,element2));
    }

    public static List<Object> concatList(List<Object> o1, List<Object> o2) {
        List<Object> groupList = new ArrayList<>();
        groupList.addAll(o1);
        groupList.addAll(o2);
        return groupList;
    }
}

