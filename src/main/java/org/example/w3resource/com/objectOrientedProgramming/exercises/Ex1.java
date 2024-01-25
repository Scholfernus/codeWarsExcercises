package org.example.w3resource.com.objectOrientedProgramming.exercises;

import lombok.Getter;
import lombok.Setter;

public class Ex1 {
    //    Write a Java program to create a class called "Person" with a name and age attribute. Create two instances of
//    the "Person" class, set their attributes using the constructor, and print their name and age.
    public static void main(String[] args) {
        Person person1 = new Person("Alex ", 33);
        System.out.println(person1.getName() + " " + person1.getAge());
        Person person2 = new Person("Anna", 25);
        System.out.println("Name " + person2.getName() + " age " + person2.getAge());
    }
}

@Setter
@Getter
class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

}
