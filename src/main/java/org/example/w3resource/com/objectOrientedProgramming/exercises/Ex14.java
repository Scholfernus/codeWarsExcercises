package org.example.w3resource.com.objectOrientedProgramming.exercises;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

public class Ex14 {
    //    Write a Java program to create a class called "School" with attributes for students, teachers, and classes,
//    and methods to add and remove students and teachers, and to create classes.
    public static void main(String[] args) {
        School newSchool = new School(new ArrayList<>(),new ArrayList<>(),new ArrayList<>());
        Students student1 = new Students("Novak", 23);
        Students student2 = new Students("Yanik", 22);
        Students student3 = new Students("Smith", 21);
        Students student4 = new Students("Creep", 20);
        newSchool.addStudent(student1);
        newSchool.addStudent(student2);
        newSchool.addStudent(student3);
        newSchool.addStudent(student4);
        Teacher newTeacher1 = new Teacher("Lewinsky", "Biology");
        Teacher newTeacher2 = new Teacher("Kowalski", "Geography");
        Teacher newTeacher3 = new Teacher("Maniac", "Philosophies");
        newSchool.addTeacher(newTeacher1);
        newSchool.addTeacher(newTeacher2);
        newSchool.addTeacher(newTeacher3);
        Classes newClass = new Classes("IT",new Teacher("Lord", "IT"));
        System.out.println(newSchool);
        System.out.println(newClass);
    }
}
@Getter
@Setter
@AllArgsConstructor
class School {
    private ArrayList<Students> students;
    private ArrayList<Teacher> teachers;
    private ArrayList<Classes> classes;

    public void addStudent(Students student) {
        students.add(student);
    }

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    public void removeStudent(Students student) {
        students.remove(student);
    }

    public void removeTeacher(Teacher teacher) {
        teachers.remove(teacher);
    }

    public void createClass(Teacher teacher, Classes name) {
        classes.add(name);
        teachers.add(teacher);
    }

    @Override
    public String toString() {
        return "School {" +
                "students=" + students +
                ", teachers=" + teachers +
                ", classes=" + classes +
                '}';
    }
}

@Getter
@Setter
@AllArgsConstructor
class Students {
    private String name;
    private int age;

    @Override
    public String toString() {
        return "\nStudents {" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

@Getter
@Setter
@AllArgsConstructor
class Teacher {
    private String name;
    private String subject;

    @Override
    public String toString() {
        return "\nTeacher{" +
                "name='" + name + '\'' +
                ", subject='" + subject + '\'' +
                '}';
    }
}

@Getter
@Setter
class Classes {
    private String className;
    private Teacher teacher;
    private ArrayList<Students> students;

    public Classes(String className, Teacher teacher) {
        this.className = className;
        this.teacher = teacher;
        this.students = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Classes{" +
                "className='" + className + '\'' +
                ", teacher=" + teacher +
                ", students=" + students +
                '}';
    }
}