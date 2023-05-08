package org.example.chatGPT;

import java.util.ArrayList;
import java.util.List;

public class ChatGPTExcercise4 {
    public static void main(String[] args) {
        // Łączenie dwóch list w jedną
        List<Object> element1 = new ArrayList<>(List.of("Bike", "2", 15,false, new Object(), new ArrayList<>()));
        List<Object> element2 = new ArrayList<>(List.of("Car", "4", 100, true, new Object(),new ArrayList<>()));
        System.out.println(concatList(element1,element2));
    }

    public static List<Object> concatList(List<Object> o1, List<Object> o2) {
        List<Object> groupList = new ArrayList<>();
        groupList.addAll(o1);
        groupList.addAll(o2);
        return groupList;
    }
}

