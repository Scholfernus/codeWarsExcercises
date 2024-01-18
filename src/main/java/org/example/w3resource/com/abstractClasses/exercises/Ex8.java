package org.example.w3resource.com.abstractClasses.exercises;

public class Ex8 {
    //    Write a Java program to create an abstract class Person with abstract methods eat() and exercise().
//    Create subclasses Athlete and LazyPerson that extend the Person class and implement the respective methods
//    to describe how each person eats and exercises.
    public static void main(String[] args) {
        Person athlete = new Athlete();
        athlete.eat();
        athlete.exercise();
        Person lazyMan = new LazyPerson();
        lazyMan.eat();
        lazyMan.exercise();
    }
}

abstract class Person {
    public abstract void eat();

    public abstract void exercise();
}

class Athlete extends Person {

    @Override
    public void eat() {
        System.out.println("Athlete: Include foods full of calcium, iron, potassium, and fiber.");
    }

    @Override
    public void exercise() {
        System.out.println("Athlete: Training allows the body to gradually build up strength and endurance, " +
                "improve skill levels and build motivation, ambition and confidence.");
    }
}

class LazyPerson extends Person {

    @Override
    public void eat() {
        System.out.println("Couch Potato: Eating while watching TV also prolongs the time period that we're eating.");
    }

    @Override
    public void exercise() {
        System.out.println("Couch Potato: Rarely exercising or being physically active.");
    }
}