package org.example.w3resource.com.abstractClasses;

abstract class Vehicle {
    public abstract void startEngine();
    public abstract void stopEngine();
}
class Car extends Vehicle{
    @Override
    public void startEngine() {
        System.out.println("Car start drive. ");
    }

    @Override
    public void stopEngine() {
        System.out.println("Car stop drive. ");
    }
}
class MotorCycle extends Vehicle{
    @Override
    public void startEngine() {
        System.out.println("Motorcycle start drive. ");
    }

    @Override
    public void stopEngine() {
        System.out.println("Motorcycle stop drive. ");
    }
}
class Main7{
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle motor = new MotorCycle();
        car.startEngine();
        car.stopEngine();
        motor.startEngine();
        motor.stopEngine();
    }
}