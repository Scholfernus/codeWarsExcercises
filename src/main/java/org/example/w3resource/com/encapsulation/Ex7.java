package org.example.w3resource.com.encapsulation;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

public class Ex7 {
    //    Write a Java program to create a class called Student with private instance variables student_id, student_name,
//    and grades. Provide public getter and setter methods to access and modify the student_id and student_name variables.
//    However, provide a method called addGrade() that allows adding a grade to the grades variable while performing
//    additional validation.
    public static void main(String[] args) {
    Student student = new Student();
    student.setStudentId(1);
    student.setStudentName("Andrew");
    student.addGrade(92);
    student.addGrade(78);
    student.addGrade(83);
    student.addGrade(91);
        int studentId = student.getStudentId();
        String studentName = student.getStudentName();
        List < Integer > grades = student.getGrades();
        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + studentName);
        System.out.println("Grades: " + grades);

    }
}

@Getter
@Setter
class Student {
    private int studentId;
    private String studentName;
    private List<Integer> grades;

    public void addGrade(int grade) {
        if (grades == null) {

            grades = new ArrayList<>();
        }
        grades.add(grade);
    }
}