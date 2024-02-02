package org.example.w3resource.com.polymorphism;

import lombok.Getter;
import lombok.Setter;

public class Ex4 {
    //    Write a Java program to create a class Employee with a method called calculateSalary(). Create two subclasses
//    Manager and Programmer. In each subclass, override the calculateSalary() method to calculate and return the salary
//    based on their specific roles.
    public static void main(String[] args) {
        Employee emp1 = new Manager("Lilo Heidi", 7500.0, 1500.0);
        Employee emp2 = new Programmer("Margrit Cathrin", 5000.0, 600.0);

        System.out.println("Manager: " + emp1.getName() + "\nRole: " + emp1.getRole() + "\nSalary: $" + emp1.calculateSalary());
        System.out.println("\nProgrammer: " + emp2.getName() + "\nRole: " + emp2.getRole() + "\nSalary: $" + emp2.calculateSalary());
    }
}

@Getter
@Setter
class Employee {
    private String name;
    private String role;

    public Employee(String name, String role) {
        this.name = name;
        this.role = role;
    }

    public double calculateSalary() {
        return 0.0;
    }
}

class Manager extends Employee {
    private double baseSalary;
    private double bonus;

    public Manager(String name, double baseSalary, double bonus) {
        super(name, "Manager");
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return baseSalary + bonus;
    }
}
class Programmer extends Employee {
    private double baseSalary;
    private double overtimePay;

    public Programmer(String name, double baseSalary, double overtimePay) {
        super(name, "Programmer");
        this.baseSalary = baseSalary;
        this.overtimePay = overtimePay;
    }

    @Override
    public double calculateSalary() {
        return baseSalary+overtimePay;
    }
}