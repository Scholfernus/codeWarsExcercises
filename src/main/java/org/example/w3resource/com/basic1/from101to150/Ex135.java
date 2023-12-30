package org.example.w3resource.com.basic1.from101to150;

import java.util.ArrayList;
import java.util.List;

public class Ex135 {
    //    Write a Java program to remove duplicates from a sorted linked list.
//Original List with duplicate elements:
//12->12->13->14->15->15->16->17->17
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(12, 12, 13, 14, 15, 15, 16, 17, 17));
        System.out.println(list);
        List<Integer> list2 = new ArrayList<>();
        for (int num : list) {
            if (!list2.contains(num)) {
               list2.add(num);
            }
        }
        System.out.println(list2);
    }
}
