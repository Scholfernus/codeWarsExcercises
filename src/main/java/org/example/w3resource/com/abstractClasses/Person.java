package org.example.w3resource.com.abstractClasses;

abstract class Person {
    public abstract void eat();
    public abstract void exercise();
}
class Athlete extends Person{
    @Override
    public void eat() {
        System.out.println("Swimmer eat a lot...");
    }

    @Override
    public void exercise() {
        System.out.println("Swimmer training very hard!");
    }
}
class LazyPerson extends Person{
    @Override
    public void eat() {
        System.out.println("LazyMan eat to much...");
    }

    @Override
    public void exercise() {
        System.out.println("LazyMan is still watching TV... ");
    }
}
class Main8{
    public static void main(String[] args) {
        Person swimmer = new Athlete();
        Person lazy = new LazyPerson();
        swimmer.eat();
        swimmer.exercise();
        lazy.eat();
        lazy.exercise();
    }
}