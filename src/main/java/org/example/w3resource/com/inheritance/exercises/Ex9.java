package org.example.w3resource.com.inheritance.exercises;

public class Ex9 {
    //    Write a Java program to create a vehicle class hierarchy. The base class should be Vehicle, with subclasses Truck,
//    Car and Motorcycle. Each subclass should have properties such as make, model, year, and fuel type.
//    Implement methods for calculating fuel efficiency, distance traveled, and maximum speed.
    public static void main(String[] args) {
// Create instances of each vehicle type
        Truck truck = new Truck("Tatra", "Tatra 810 4x4", 2020, "GASOLINE", 8.112, 4.5);
        Car2 car = new Car2("Volkswagen", "Virtus", 2019, "HYBRID", 6.123, 8);
        Motorcycle motorcycle = new Motorcycle("Massimo Motor", "Warrior200", 2018, "GASOLINE", 2.1);

// Print the vehicle details and calculations
        System.out.println("Truck Model: " + truck.getModel());
        System.out.println("Fuel Efficiency: " + truck.calculateFuelEfficiency() + " mpg");
        System.out.println("Distance Traveled: " + truck.calculateDistanceTraveled() + " miles");
        System.out.println("Max Speed: " + truck.getMaxSpeed() + " mph\n");

        System.out.println("Car Model: " + car.getModel());
        System.out.println("Fuel Efficiency: " + car.calculateFuelEfficiency() + " mpg");
        System.out.println("Distance Traveled: " + car.calculateDistanceTraveled() + " miles");
        System.out.println("Max Speed: " + car.getMaxSpeed() + " mph\n");

        System.out.println("Motorcycle Model: " + motorcycle.getModel());
        System.out.println("Fuel Efficiency: " + motorcycle.calculateFuelEfficiency() + " mpg");
        System.out.println("Distance Traveled: " + motorcycle.calculateDistanceTraveled() + " miles");
        System.out.println("Max Speed: " + motorcycle.getMaxSpeed() + " mph");
    }
}
abstract class Vehicle2{
    private String make;
    private String model;
    private int year;
    private String fuelType;
    private double fuelEfficiency;

    public Vehicle2(String make, String model, int year, String fuelType, double fuelEfficiency) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.fuelType = fuelType;
        this.fuelEfficiency = fuelEfficiency;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getFuelType() {
        return fuelType;
    }

    public double getFuelEfficiency() {
        return fuelEfficiency;
    }

    public abstract double calculateFuelEfficiency();

    public abstract double calculateDistanceTraveled();

    public abstract double getMaxSpeed();
}
class Car2 extends Vehicle2{
    private int numSeats;

    public Car2(String make, String model, int year, String fuelType, double fuelEfficiency,int numSeats) {
        super(make, model, year, fuelType, fuelEfficiency);
        this.numSeats = numSeats;
    }

    public int getNumSeats() {
        return numSeats;
    }

    @Override
    public double calculateFuelEfficiency() {
        // implementation for fuel efficiency calculation for cars
        return getFuelEfficiency() * (1.0 / (1.0 + (getNumSeats() / 5.0)));
    }

    @Override
    public double calculateDistanceTraveled() {
        // implementation for distance traveled calculation for cars
        return calculateFuelEfficiency() * getFuelEfficiency();
    }

    @Override
    public double getMaxSpeed() {
        // implementation for maximum speed calculation for cars
        return 120.0;
    }
}
class Motorcycle extends Vehicle2{
    private double engineDisplacement;

    public Motorcycle(String make, String model, int year, String fuelType, double fuelEfficiency) {
        super(make, model, year, fuelType, fuelEfficiency);
        this.engineDisplacement = engineDisplacement;
    }

    public double getEngineDisplacement() {
        return engineDisplacement;
    }

    @Override
    public double calculateFuelEfficiency() {
        // implementation for fuel efficiency calculation for motorcycles
        return getFuelEfficiency() * (1.0 / (1.0 + (getEngineDisplacement() / 1000.0)));
    }

    @Override
    public double calculateDistanceTraveled() {
        // implementation for distance traveled calculation for cars
        return calculateFuelEfficiency() * getFuelEfficiency();
    }

    @Override
    public double getMaxSpeed() {
        // implementation for maximum speed calculation for cars
        return 80.0;
    }
}
class Truck extends Vehicle2{
    private double cargoCapacity;

    public Truck(String make, String model, int year, String fuelType, double fuelEfficiency, double cargoCapacity) {
        super(make, model, year, fuelType, fuelEfficiency);
        //Truck("Ford", "F-150", 2020, "GASOLINE", 8.112);
        this.cargoCapacity = cargoCapacity;
    }
    public double getCargoCapacity() {
        return cargoCapacity;
    }

    @Override
    public double calculateFuelEfficiency() {
        // implementation for fuel efficiency calculation for trucks
        return getFuelEfficiency()*(1.0 / (1.0 + (getCargoCapacity() / 1000.0)));
    }

    @Override
    public double calculateDistanceTraveled() {
        // implementation for distance traveled calculation for trucks
        return calculateFuelEfficiency() * getFuelEfficiency();
    }

    @Override
    public double getMaxSpeed() {
        // implementation for maximum speed calculation for trucks
        return 80.0;
    }
}
