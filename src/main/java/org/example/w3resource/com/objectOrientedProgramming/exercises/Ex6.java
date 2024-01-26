package org.example.w3resource.com.objectOrientedProgramming.exercises;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

public class Ex6 {
    //    Write a Java program to create a class called "Employee" with a name, job title, and salary attributes,
//    and methods to calculate and update salary.
    public static void main(String[] args) {
        Employee employee1 = new Employee("Franziska Waltraud", "HR Manager", 40000);
        Employee employee2 = new Employee("Hubertus Andrea", "Software Engineer", 60000);
        System.out.println("\nEmployee Details:");
        employee1.calculateSalary(8);
        employee2.calculateSalary(12);

        System.out.println("\nAfter raising salary:");
        System.out.println("\n8% for 'Franziska Waltraud':");

        System.out.println("\n12% for 'Hubertus Andrea':");
    }
}

@Getter
@Setter
@AllArgsConstructor
class Employee {
    private String name;
    private String jobTitle;
    private double salary;

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }

    public void calculateSalary(double percentage) {
        double finalSalary = this.salary + this.salary * percentage / 100;
    }
}
