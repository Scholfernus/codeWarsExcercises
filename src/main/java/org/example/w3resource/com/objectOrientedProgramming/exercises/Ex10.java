package org.example.w3resource.com.objectOrientedProgramming.exercises;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

public class Ex10 {
    //    Write a Java program to create a class called "Student" with a name, grade, and courses attributes,
//    and methods to add and remove courses.
    public static void main(String[] args) {
        Student student1 = new Student("Kovalski", 11);
        Student student2 = new Student("Novak",10);
        Student student3 = new Student("McDonald", 9);
        List<Student> listOfStudents = new ArrayList<Student>();
        listOfStudents.add(student1);
        listOfStudents.add(student2);
        listOfStudents.add(student3);
        student1.addCourse("Geography");
        student1.addCourse("Math");
        student1.addCourse("Science");
        student1.addCourse("English");
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(listOfStudents + " \n");
        student2.removeCourse("Math");
        System.out.println(student2);
    }
}

@Getter
@Setter
class Student {
    private String name;
    private int grade;
    private ArrayList<String> courses;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grade=" + grade +
                ", courses=" + courses +
                '}';
    }

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
        this.courses = new ArrayList<>();
    }

    public void addCourse(String course) {
        courses.add(course);
    }
    public void removeCourse(String course){
        courses.remove(course);
    }
}