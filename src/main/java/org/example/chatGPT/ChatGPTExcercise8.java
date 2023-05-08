package org.example.chatGPT;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ChatGPTExcercise8 {
    // Wyszukiwanie elementu w liście
    public static void main(String[] args) {
        List<Object> objectsList = new ArrayList<>(List.of(5, -3, 10, 16, new ArrayList<>(), -25, 0, 12,false, 3, 100));
        int index = searchNumber(objectsList,false);
        System.out.println(index);
    }
    public static int searchNumber(List<Object>list, Object element){
        int index = list.indexOf(element);
        return index;
    }
}
