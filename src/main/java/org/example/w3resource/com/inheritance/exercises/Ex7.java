package org.example.w3resource.com.inheritance.exercises;

public class Ex7 {
    //    Write a Java program to create a class known as Person with methods called getFirstName() and getLastName().
//    Create a subclass called Employee2 that adds a new method named getEmployeeId() and overrides the getLastName()
//    method to include the employee's job title.
    public static void main(String[] args) {
    Employee2 employee100 = new Employee2("Paul","Young",100,"Doctor");
        System.out.println(employee100.getFirstName() + " " + employee100.getLastName() + " (" + employee100.getEmployeeId() + ")");
        Employee2 employee200 = new Employee2("Anna","Old",200,"Animator");
        System.out.println(employee200.getFirstName()+ " " + employee200.getLastName() + " (" + employee200.getEmployeeId() + ")");
    }
}

class Person {
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}

class Employee2 extends Person {
    private int employeeId;
    private String jobTitle;

    public Employee2(String firstName, String lastName, int employeeId, String jobTitle) {
        super(firstName, lastName);
        this.employeeId = employeeId;
        this.jobTitle = jobTitle;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    @Override
    public String getLastName() {
        return super.getLastName() + ", " + jobTitle;
    }
}