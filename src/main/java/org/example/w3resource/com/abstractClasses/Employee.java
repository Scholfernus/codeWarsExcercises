package org.example.w3resource.com.abstractClasses;

abstract class Employee {
    protected String name;
    protected double baseSalary;

    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public abstract void calculateSalary();

    public abstract void displayInformation();

}

class Manager extends Employee {
    private double bonus;
    private double finalSalary;

    public Manager(String name, double baseSalary, double bonus) {
        super(name, baseSalary);
        this.bonus = bonus;
    }

    public double getFinalSalary() {
        return finalSalary = baseSalary + bonus;
    }

    @Override
    public void calculateSalary() {
        finalSalary = baseSalary + bonus;
    }

    @Override
    public void displayInformation() {
        System.out.println("Manager name: " + name);
        System.out.println("Base salary: $ " + baseSalary);
        System.out.println("Bonus: $ " + bonus);
        System.out.println("Total salary: $ " + getFinalSalary());
    }
}

class Programmer extends Employee {
    private int overtimeHours;
    private double hourlyRate;
    private double finalSalary;

    public Programmer(String name, double baseSalary, int overtimeHours, double hourlyRate) {
        super(name, baseSalary);
        this.overtimeHours = overtimeHours;
        this.hourlyRate = hourlyRate;
    }

    public double getOvertimeHours() {
        return finalSalary = (overtimeHours * hourlyRate) + baseSalary;
    }

    @Override
    public void calculateSalary() {

    }

    @Override
    public void displayInformation() {
        System.out.println("Programmer Name: " + name);
        System.out.println("Base Salary: $" + baseSalary);
        System.out.println("Overtime Hours: " + overtimeHours);
        System.out.println("Hourly Rate: $" + hourlyRate);
        System.out.println("Total Salary: $" + getOvertimeHours());
    }
}
class Main5{
    public static void main(String[] args) {
        Employee worker = new Manager("John",5000,1500);
        Employee programmer = new Programmer("Ivan",5000,12,100);
        worker.displayInformation();
        System.out.println("-----------------");
        programmer.displayInformation();
    }
}




