package org.example.w3resource.com.objectOrientedProgramming.exercises;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

public class Ex9 {
//    Write a Java program to create a class called "Employee" with a name, salary, and hire date attributes,
//    and a method to calculate years of service.

    public static void main(String[] args) {
        Employee2 emp = new Employee2("John", 2000, 1998);
        int hireDate = emp.getHireDate();
        emp.yearsOfService();
        System.out.println(hireDate + " - date of hire");
        System.out.println(emp);
    }
}

@Getter
@Setter
@AllArgsConstructor
class Employee2 {
    private String name;
    private double salary;
    private int hireDate;

    public void yearsOfService() {
        int today = LocalDateTime.now().getYear();
        int years = today - this.hireDate;
        System.out.println(years + " years of hire");
    }

    @Override
    public String toString() {
        return "Employee-> {" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", hireDate=" + hireDate +
                '}';
    }
}