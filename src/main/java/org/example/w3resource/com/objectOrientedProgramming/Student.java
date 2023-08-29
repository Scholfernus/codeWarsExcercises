package org.example.w3resource.com.objectOrientedProgramming;

public class Student {
    private String name;
    private int grade;
    private String courses;

    public Student(String name, int grade, String courses) {
        this.name = name;
        this.grade = grade;
        this.courses = courses;
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

    public String getCourses() {
        return courses;
    }

    public void setCourses(String courses) {
        this.courses = courses;
    }
    public void addCourses(){

    }
    public void removeCourses(){

    }

}
