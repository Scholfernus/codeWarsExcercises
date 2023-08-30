package org.example.w3resource.com.objectOrientedProgramming;

import java.util.ArrayList;

public class Student {
    private String name;
    private int grade;
    private ArrayList<String> courses;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
        this.courses = new ArrayList<String>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void setCourses(ArrayList<String> courses) {
        this.courses = courses;
    }

    public ArrayList<String> getCourses() {
        return courses;
    }

    public void addCourses(String course) {
        courses.add(course);
    }

    public void removeCourses(String course) {
        courses.remove(course);
    }

    public void printStudentDetails() {
        System.out.println("Name: " + name);
        System.out.println("Grade: " + grade);
    }
}
class Main8{
    public static void main(String[] args) {
        Student student1 = new Student("John Bon",11);
        Student student2 = new Student("Uhuru Namashi", 10);
        Student student3 = new Student("George Cherice",10);
        System.out.println("Student Details:");
        student1.printStudentDetails();
        student2.printStudentDetails();
        student3.printStudentDetails();

        System.out.println("Adding courses for " + student1.getName());
        student1.addCourses("Math");
        student1.addCourses("Science");
        student1.addCourses("English");
        System.out.println(student1.getName() + "'s courses: " + student1.getCourses());

        System.out.println("\nAdding courses for " + student2.getName());
        student2.addCourses("History");
        student2.addCourses("Geography");
        student2.addCourses("English");
        System.out.println(student2.getName() + " 's courses: " + student2.getCourses());

        System.out.println("\nRemoving 'Science' course for " + student1.getName());
        student1.removeCourses("Science");
        System.out.println(student1.getName() + "'s courses: " + student1.getCourses());
    }
}