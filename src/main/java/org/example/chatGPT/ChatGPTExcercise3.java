package org.example.chatGPT;

import java.util.*;

public class ChatGPTExcercise3 {

    // Usuwanie duplikatów z listy
    public static void main(String[] args) {
    List<Object>list = new ArrayList<>();
    list.add("Five");
    list.add(null);
    list.add(5);
    list.add(50.65);
    list.add("letter");
    list.add(true);
    list.add(5);
    list.add(null);
    list.add(new ArrayList<>());
    list.add(5);
        System.out.println(uniqueElements(list));
    }
    public static List<Object>uniqueElements (List<Object> objectList){
        Set<Object> uniqueSet = new HashSet<>(objectList);
        return new ArrayList<>(uniqueSet);
    }
}
