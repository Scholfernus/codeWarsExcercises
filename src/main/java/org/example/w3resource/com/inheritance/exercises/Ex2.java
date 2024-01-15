package org.example.w3resource.com.inheritance.exercises;

class Vehicle {
    //    Write a Java program to create a class called Vehicle with a method called drive().
//    Create a subclass called Car that overrides the drive() method to print "Repairing a car".
    public void drive() {
        System.out.println("Repairing a vehicle ");
    }
}
class Car extends Vehicle {
    @Override
    public void drive() {
        System.out.println("Repairing a car");
    }
}
public class Ex2 {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        Car car = new Car();
        vehicle.drive();
        car.drive();
    }
}