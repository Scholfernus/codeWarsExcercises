package org.example.codingWithJohn;

import java.util.*;

public class SetAndHashSet {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        names.add("Walter");
        names.add("Jesse");
        names.add("Skyler");
        names.add("Mike");
        names.add("Saul");

        names.remove("Walter");
        //names.remove(0);
        System.out.println(names);
        System.out.println(names.contains("Saul"));
        System.out.println(names.isEmpty());
        for (String name : names) {
            System.out.println(name);
        }
        names.forEach(System.out::println);
        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(2);
        numbers.add(1);
        numbers.forEach(System.out::println);
        Set<Integer> numbersSet = new HashSet<>(numbers);
//        numbersSet.addAll(numbers);
        System.out.println();
        numbersSet.forEach(System.out::println);
        Set<String>anotherNames = new TreeSet<>(names);
        System.out.println(anotherNames);
        Set<String>linkedNames = new LinkedHashSet<>(names);
        System.out.println(linkedNames);

    }
}
