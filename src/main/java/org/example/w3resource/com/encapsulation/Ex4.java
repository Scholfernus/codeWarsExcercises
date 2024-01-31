package org.example.w3resource.com.encapsulation;

public class Ex4 {
    //     Write a Java program to create a class called Employee with private instance variables employee_id, employee_name,
//     and employee_salary. Provide public getter and setter methods to access and modify the id and name variables,
//     but provide a getter method for the salary variable that returns a formatted string.
    public static void main(String[] args) {
    Employee employee = new Employee();
    employee.setEmployeeId(1);
    employee.setEmployeeName("John Malko");
    employee.setEmployeeSalary(1000.50);

        int employeeId = employee.getEmployeeId();
        String employeeName = employee.getEmployeeName();
        String formattedSalary = employee.getFormattedSalary();
        double employeeSalary = employee.getEmployeeSalary();

        System.out.println("Employee Details:");
        System.out.println("ID: " + employeeId);
        System.out.println("Name: " + employeeName);
        System.out.println("Salary: " + employeeSalary);
        System.out.println("Salary: " + formattedSalary);
    }
}
class Employee{
    private int employeeId;
    private String employeeName;
    private double employeeSalary;

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public double getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(double employeeSalary) {
        this.employeeSalary = employeeSalary;
    }
    public String getFormattedSalary() {
        return String.format("$%.2f", employeeSalary);
    }
}