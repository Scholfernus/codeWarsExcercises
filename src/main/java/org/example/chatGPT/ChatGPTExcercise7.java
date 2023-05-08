package org.example.chatGPT;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ChatGPTExcercise7 {
     // 7. Odwracanie kolejności elementów w liście
    public static void main(String[] args) {
        List<Object>o1 = new ArrayList<>();
        o1.add("Five");
        o1.add(null);
        o1.add(5);
        o1.add(true);
        o1.add(new ArrayList<>());
        o1.add(-5);
        o1.add(5);
        o1.add(3);
        o1.add("one");
        o1.add(false);
        System.out.println(revereList(o1));
    }
    public static List<Object>revereList(List<Object>data){
        Collections.reverse(data);
        return data;
    }
}
