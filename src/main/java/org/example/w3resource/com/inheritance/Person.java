package org.example.w3resource.com.inheritance;

public class Person {
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

class Main7 {
    public static void main(String[] args) {

        Person person = new Person("Paul","Hol");
        Employee2 employee1 = new Employee2("Rosalie","Flower", 1,"Secretaire");
        System.out.println(employee1.getFirstName() + " " + employee1.getLastName()
       + " (" + employee1.getEmployeeId() + ")");
        Employee2 employee2 = new Employee2("John", "Lord", 2, "Director");
        System.out.println(employee2.getFirstName() + " " + employee2.getLastName()
                + " (" + employee2.getEmployeeId() + ")");
    }
}