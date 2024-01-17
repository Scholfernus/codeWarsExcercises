package org.example.w3resource.com.abstractClasses.exercises;

public class Ex4 {
    //    Write a Java program to create an abstract class Animal with abstract methods eat() and sleep().
//    Create subclasses Lion, Tiger, and Deer that extend the Animal class and implement the eat() and sleep()
//    methods differently based on their specific behavior.
    public static void main(String[] args) {
        Lion2 lion = new Lion2();
        lion.eat();
        lion.sleep();
        Tiger2 tiger = new Tiger2();
        tiger.eat();
        tiger.sleep();
        Deer deer = new Deer();
        deer.eat();
        deer.sleep();
    }
}

abstract class Animal2 {
    public abstract void eat();

    public abstract void sleep();
}

class Lion2 extends Animal2 {

    @Override
    public void eat() {
        System.out.println("Lion eats gazelle.");
    }

    @Override
    public void sleep() {
        System.out.println("Lion sleeps 10 hours");
    }
}

class Tiger2 extends Animal2 {

    @Override
    public void eat() {
        System.out.println("Tiger eats zebra");
    }

    @Override
    public void sleep() {
        System.out.println("Tiger sleeps 12 hours");
    }
}

class Deer extends Animal2 {
    @Override
    public void eat() {
        System.out.println("Deer eats grass");
    }

    @Override
    public void sleep() {
        System.out.println("Deer sleeps in the forest");
    }
}