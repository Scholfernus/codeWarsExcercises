package org.example.w3resource.com.polymorphism;

import org.checkerframework.checker.units.qual.A;

public class Ex1 {
//    Write a Java program to create a base class Animal (Animal Family) with a method called Sound(). Create two
//    subclasses Bird and Cat. Override the Sound() method in each subclass to make a specific sound for each animal.

    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.makeSound();
        Animal bird = new Bird();
        bird.makeSound();
        Animal cat = new Cat();
        cat.makeSound();
    }
}

class Animal {
    void makeSound() {
        System.out.println("The animal makes a sound");
    }
}

class Bird extends Animal {
    @Override
    void makeSound() {
        System.out.println("The bird chirps");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("The cat meows");
    }
}