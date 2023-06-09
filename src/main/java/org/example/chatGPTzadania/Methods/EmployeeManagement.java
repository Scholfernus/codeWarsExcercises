package org.example.chatGPTzadania.Methods;


import java.util.ArrayList;
import java.util.List;

public interface EmployeeManagement {
    List<String> employees = new ArrayList<>();

    void addEmployee(String employee);

    void removeEmployee(String employee);

    String getEmployee(int employeeId);

    List<String> getAllEmployees();
}

    class Employee implements EmployeeManagement {

    @Override
    public void addEmployee(String employee) {
        employees.add(employee);
    }
    @Override
    public void removeEmployee(String employee) {
        employees.remove(employee);
    }

    @Override
    public String getEmployee(int employeeId) {
        return employees.get(employeeId);
    }

    @Override
    public List<String> getAllEmployees() {
       return new ArrayList<>(employees);
    }

    public static void main(String[] args) {
        EmployeeManagement employee = new Employee();

        employees.add("Paul");
        employees.add( "Anne");
        employees.add("Gregory");
        employees.add("Peter");
        employees.add( "Victoria");
        employees.add( "John");

        System.out.println("Employee at index 2: " + employee.getEmployee(2));

        employee.removeEmployee("Peter");
        List<String>allEmployees = employee.getAllEmployees();
        System.out.println("All employees" + allEmployees);
        employee.addEmployee("Mike");
        List<String>allEmployees2 = employee.getAllEmployees();
        System.out.println("All employees" + allEmployees2);

    }
}
