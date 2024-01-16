package org.example.w3resource.com.inheritance.exercises;

public class Ex6 {
    //Write a Java program to create a class called Animal with a method named move().
    // Create a subclass called Cheetah that overrides the move() method to run.
    public static void main(String[] args) {
    Animal animal = new Animal();
    animal.move();
    Cheetah cheetah = new Cheetah();
    cheetah.move();
    }
}
class Animal{
    public void move(){
        System.out.println("Animal is moving.");
    }
}
class Cheetah extends Animal{
    @Override
    public void move() {
        super.move();
        System.out.println("This is running.");
    }
}