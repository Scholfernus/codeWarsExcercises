package org.example.w3resource.com.inheritance.exercises;

public class Ex4 {
    //    Write a Java program to create a class called Employee2 with methods called work() and getSalary().
//    Create a subclass called HRManager that overrides the work() method and adds a new method called addEmployee().
    public static void main(String[] args) {
        Employee employee = new Employee();
        HRManager hrManager = new HRManager("Novak", "John", "Alabama str.", 2500);
        double salary = employee.getSalary();
        employee.work();
        hrManager.addEmployee();
        hrManager.work();
        String firstName = hrManager.firstName;
        String address = hrManager.address;
        String lastName = hrManager.lastName;
        double salary1 = hrManager.getSalary();
        System.out.println(salary1 + " " + firstName+ " " +lastName+ " " +address);
        System.out.println(salary);
    }
}

class Employee {

    public void work() {
        System.out.println("Positive");
    }

    public double getSalary() {
        return 1000.50;
    }
}

class HRManager extends Employee {
    String lastName;
    String firstName;
    String address;

    public HRManager(String lastName, String firstName, String address, double salary) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.address = address;
        this.getSalary();
    }

    @Override
    public void work() {
        System.out.println("\nManaging employees");
    }

    @Override
    public double getSalary() {
        return super.getSalary();
    }

    public void addEmployee() {
        System.out.println("\nAdding new employee!");
    }
}