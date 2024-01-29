package org.example.w3resource.com.interfaceClass.exercises;

public class Ex3 {
    //    Write a Java program to create an interface Flyable with a method called fly_obj(). Create three classes
//    Spacecraft, Airplane, and Helicopter that implement the Flyable interface. Implement the fly_obj() method for
//    each of the three classes.
    public static void main(String[] args) {
    Flyable[]objects = {new Spacecraft(), new Airplane(), new Helicopter()};
        for (Flyable obj : objects) {
                obj.flyObj();
        }
    }
}
interface Flyable{
    void flyObj();
}
class Spacecraft implements Flyable{

    @Override
    public void flyObj() {
        System.out.println("Spacecraft is flying");
    }
}
class Airplane implements Flyable{

    @Override
    public void flyObj() {
        System.out.println("Airplane is flying");
    }
}
class Helicopter implements Flyable {
    // Implement the "fly_obj" method required by the Flyable interface
    @Override
    public void flyObj() {
        // Print a message indicating that the Helicopter is flying
        System.out.println("Helicopter is flying");
    }
}