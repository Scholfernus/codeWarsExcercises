package org.example.w3resource.com.inheritance;

public class Animal {
    public void makeSound() {
        System.out.print("The animal makes a sound: ");
    }
}
class Cat extends Animal {
    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println("Meow");
    }
}
class Main{
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.makeSound();
        Animal animal = new Animal();
        animal.makeSound();
    }
}
