package org.example;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> namesLinkedList = new LinkedList<>();
        namesLinkedList.add("John");
        namesLinkedList.add("Paul");
        namesLinkedList.add("George");
        namesLinkedList.add("Ringo");
        System.out.println(namesLinkedList.get(2));
        namesLinkedList.add(1,"Jack");

        String[] names = new String[4];
        ArrayList<String> namesArraysList = new ArrayList<>();
        namesArraysList.add("John");
        namesArraysList.add("Paul");
        namesArraysList.add("George");
        namesArraysList.add("Ringo");
        System.out.println(namesArraysList.get(2));
        namesArraysList.add(1,"Jack");
    }
}
