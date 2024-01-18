package org.example.w3resource.com.abstractClasses.exercises;

public class Ex11 {
    //    Write a Java program to create an abstract class Bird with abstract methods fly() and makeSound().
//    Create subclasses Eagle and Hawk that extend the Bird class and implement the respective methods to describe
//    how each bird flies and makes a sound.
    public static void main(String[] args) {
    Bird eagle = new Eagle();
    eagle.fly();
    eagle.makeSound();
    Bird hawk = new Hawk();
    hawk.fly();
    eagle.makeSound();
    }
}
abstract class Bird{
    public abstract void fly();
    public abstract void makeSound();
}
class Eagle extends Bird{

    @Override
    public void fly() {
        System.out.println("Eagle fly high");
    }

    @Override
    public void makeSound() {
        System.out.println("We cannot here the sound");
    }
}
class Hawk extends Bird{
    @Override
    public void fly() {
        System.out.println("Hawk is very fast");
    }

    @Override
    public void makeSound() {
        System.out.println("Hawk make a strange sound");
    }
}