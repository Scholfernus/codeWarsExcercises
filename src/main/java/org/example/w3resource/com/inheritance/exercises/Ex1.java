package org.example.w3resource.com.inheritance.exercises;

public class Ex1 {
    //    Write a Java program to create a class called Animal with a method called makeSound().
//    Create a subclass called Cat that overrides the makeSound() method to bark.
    public void makeSound() {
        System.out.println("The animal makes some sound: ");
    }
}
class Cat extends Ex1{
    @Override
    public void makeSound() {
//        super.makeSound();
        System.out.println("Cat does 'meow'");
    }
}
class Main{
    public static void main(String[] args) {
        Ex1 animal = new Ex1();
        animal.makeSound();
        Cat cat = new Cat();
        cat.makeSound();
    }
}