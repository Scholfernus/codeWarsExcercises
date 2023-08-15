package org.example.w3resource.com.inheritance;

public class Vehicle {
     void drive(){
         System.out.println("Repairing a vehicle");
     }
}
class Car extends Vehicle{
    @Override
    void drive() {
        System.out.println("Repairing a car");
    }
}
class Main2 {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.drive();
        Car car = new Car();
        car.drive();
    }

}