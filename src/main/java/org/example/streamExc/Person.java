package org.example.streamExc;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Person {
    private String name;
    private int age;
    private String gender;

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public static void main(String[] args) {
        List<Person> boys = new ArrayList<>();
        boys.add(new Person("Luke", 24,"MALE"));
        boys.add(new Person("John", 20, "MALE"));
        boys.add(new Person("Mike", 17, "MALE"));
        boys.add(new Person("Tom", 25, "MALE"));
        boys.add(new Person("Julia",22,"FEMALE"));

        List<String> adultMalesNames = getAdultMalesNames(boys);
        System.out.println(adultMalesNames);
    }

    public static List<String> getAdultMalesNames(List<Person> boys) {
        return boys.stream()
                .filter(person -> person.getGender().equals("MALE") && person.getAge() >= 18)
                .map(Person::getName)
                .collect(Collectors.toList());
    }
}
