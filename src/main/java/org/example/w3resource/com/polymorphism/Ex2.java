package org.example.w3resource.com.polymorphism;

public class Ex2 {
    // Write a Java program to create a class Vehicle with a method called speedUp(). Create two subclasses Car and Bicycle.
// Override the speedUp() method in each subclass to increase the vehicle's speed differently.
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        Car car = new Car();
        Bike bike = new Bike();

        vehicle.speedUp();
        car.speedUp();
        bike.speedUp();
        System.out.println("Car initial speed: " + car.getSpeed());
        System.out.println("Motorcycle initial speed: " + bike.getSpeed());
        car.speedUp();
        bike.speedUp();
        System.out.println("\nCar speed after speeding up: " + car.getSpeed());
        System.out.println("Motorcycle speed after speeding up: " + bike.getSpeed());
    }
}

class Vehicle {
    private int speed;

    void speedUp() {
        speed += 10;
        System.out.println("Vehicle accelerate");
    }

    public int getSpeed() {
        return speed;
    }
}

class Car extends Vehicle {
    @Override
    void speedUp() {
        super.speedUp();
        System.out.println("Car is running");
    }
}

class Bike extends Vehicle {
    @Override
    void speedUp() {
        super.speedUp();
        System.out.println("Bike is flying almost");
    }
}