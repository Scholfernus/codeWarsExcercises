package org.example.codingWithJohn;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayVsArrayList {
    public static void main(String[] args) {
        String[] friendsArray = new String[4];
        String[] friendsArray2 = {"John", "Chris", "Eric", "Luke"};
        ArrayList<String> friendsArrayList = new ArrayList<>();
        ArrayList<String> friendsArrayList2 =
                new ArrayList<>(Arrays.asList("John", "Chris", "Eric", "Luke"));

        System.out.println(friendsArray[1]);
        System.out.println(friendsArrayList2.get(1));

        System.out.println(friendsArray.length);
        System.out.println(friendsArrayList2.size());

        friendsArrayList2.add("Mitch");
        System.out.println(friendsArrayList2.get(4));

        friendsArray[0] = "Carl";
        System.out.println(friendsArray[0]);
        friendsArrayList2.set(0, "Carl");
        System.out.println(friendsArrayList2.get(0));

        friendsArrayList2.remove(1);
        System.out.println(friendsArrayList2.get(1));

        System.out.println(Arrays.toString(friendsArray2));
        System.out.println(friendsArrayList2);

    }
}
