package org.example.w3resource.com.objectOrientedProgramming;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.util.Date;

public class Employee2 {
    private String name;
    private double salary;
    private LocalDate hireDate;

    public Employee2(String name, double salary, LocalDate hireDate) {
        this.name = name;
        this.salary = salary;
        this.hireDate = hireDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    public int getYearOfService() {
        return Period.between(hireDate, LocalDate.now()).getYears();
    }

    public void printEmployeeDetails() {
        System.out.println("\nName: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("HireDate: " + hireDate);
    }
}

class Main9 {
    public static void main(String[] args) {
        Employee2 employee1 = new Employee2("Roberto Cekon", 50000, LocalDate.parse("2021-08-12"));
        Employee2 employee2 = new Employee2("Loyd Oscar", 70000, LocalDate.parse("2015-04-01"));
        Employee2 employee3 = new Employee2("Magda Artemon", 50000, LocalDate.parse("2011-01-15"));
        employee1.printEmployeeDetails();
        System.out.println("Years of Service: " + employee1.getYearOfService());
        employee2.printEmployeeDetails();
        System.out.println("Years of Service: " + employee2.getYearOfService());
        employee3.printEmployeeDetails();
        System.out.println("Years of Service: " + employee3.getYearOfService());
    }
}
