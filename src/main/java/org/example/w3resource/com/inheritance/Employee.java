package org.example.w3resource.com.inheritance;

public class Employee {
    private int salary;

    public Employee(int salary) {
        this.salary = salary;
    }

    void work() {
        System.out.println("Working as an employee!");
    }

    public int getSalary() {
        return salary;
    }
}

class HRManager extends Employee {
    public HRManager(int salary) {
        super(salary);
    }

    @Override
    public int getSalary() {
        return super.getSalary();
    }
    public void work() {
        System.out.println("\nManaging employees");
    }
    void addEmployee() {
        System.out.println("\nAdding new employee!");
    }
}

class Main4 {
    public static void main(String[] args) {
        Employee employee = new Employee(4000);
        HRManager hr = new HRManager(7000);
        employee.work();
        System.out.println("Employee salary: " + employee.getSalary());
        hr.work();
        System.out.println("Employee salary: " + hr.getSalary());
        hr.addEmployee();
    }
}