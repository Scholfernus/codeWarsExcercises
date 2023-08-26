package org.example.w3resource.com.objectOrientedProgramming;

public class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;

    }
    public static void main(String[] args) {
        Person person = new Person("John",33);
        Person person1 = new Person("Mike", 28);
        System.out.println("Name: " + person.name + "\nAge: " + person.age);
        System.out.println(person1.getName() + " is " + person1.age + " years old.");
    }
}
