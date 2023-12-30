package org.example.w3resource.com.basic1.from101to150;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ex121 {
    //    Write a Java program to reverse a linked list.
//Example: For linked list 20->40->60->80, the reversed linked list is 80->60->40->20
    public static void main(String[] args) {
        List<Integer>numb = new ArrayList<>();
        numb.add(25);
        numb.add(26);
        numb.add(27);
        numb.add(28);
        numb.add(29);
        System.out.println(numb);
        Collections.reverse(numb);
        System.out.println(numb);
        List<Integer> numbers = new ArrayList<>(List.of(20, 40, 60, 80));
        Collections.reverse(numbers);
        System.out.println(numbers);
    }
}
