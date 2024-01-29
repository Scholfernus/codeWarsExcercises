package org.example.w3resource.com.interfaceClass.exercises;

public class Ex2 {
    //    Write a Java program to create a Animal interface with a method called bark() that takes no arguments and
//    returns void. Create a Dog class that implements Animal and overrides speak() to print "Dog is barking".
    public static void main(String[] args) {
    Animals dog = new Dog2();
    dog.bark();
    }
}
interface Animals {
    public void bark();
}
class Dog2 implements Animals{

    @Override
    public void bark() {
        System.out.println("Dog is barking");
    }
}