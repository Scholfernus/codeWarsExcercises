package org.example.w3resource.com.lambda.exercises;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Ex20 {
    //    Write a Java program to implement a lambda expression to sort a list of objects based on a specific attribute.
    public static void main(String[] args) {
        List< Student > studentList = new ArrayList< >();
        studentList.add(new Student("Jair Camila", 14, "X"));
        studentList.add(new Student("Micaela Rosana", 15, "X"));
        studentList.add(new Student("Conceicao Palmira", 11, "X"));
        studentList.add(new Student("Adriana Jamie", 16, "X"));
        studentList.add(new Student("Felix Uisdean", 17, "X"));
        System.out.println("Student details:");
        for (Student student: studentList  ) {
            System.out.println(student.getName() + " - " + student.getAge() + " - " + student.getsClass());
        }
        studentList.sort(Comparator.comparing(Student::getName));
        System.out.println("\nSorted list based on Student Name:");
        for (Student student: studentList  ) {
            System.out.println(student.getName() + " - " + student.getAge() + " - " + student.getsClass());
        }
        System.out.println("\nSorted list based on Student Age:");
        studentList.sort(Comparator.comparing(Student::getAge));
        for (Student student: studentList  ) {
            System.out.println(student.getName() + " - " + student.getAge() + " - " + student.getsClass());
        }
    }
}
class Student {
    private final String name;
    private final String sClass;
    private final int age;
    public Student(String name, int age, String sClass) {
        this.name = name;
        this.age = age;
        this.sClass = sClass;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getsClass() {
        return sClass;
    }
}