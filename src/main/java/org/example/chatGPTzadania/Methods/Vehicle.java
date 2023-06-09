package org.example.chatGPTzadania.Methods;

public interface Vehicle {
    void start();

    void stop();

    void accelerate(double speed);

    void brake();
}

class Car implements Vehicle {
    private String brand;
    private double currentSpeed;

    public Car(String brand, double currentSpeed) {
        this.brand = brand;
        this.currentSpeed = currentSpeed;
    }

    @Override
    public void start() {
        System.out.println("Car started.");
    }

    @Override
    public void stop() {
        System.out.println("car stopped.");
    }

    @Override
    public void accelerate(double speed) {
        currentSpeed += speed;
        System.out.println("Car accelerated. Current speed: " + currentSpeed);
    }

    @Override
    public void brake() {
        System.out.println("Car braked.");
        currentSpeed = 0;
    }

    public static void main(String[] args) {
        Car car = new Car("Toyota",99);
        car.start();
        car.accelerate(25);
        car.brake();
        car.stop();
    }
}