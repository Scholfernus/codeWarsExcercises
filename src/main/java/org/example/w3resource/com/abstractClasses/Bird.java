package org.example.w3resource.com.abstractClasses;

abstract class Bird {
public abstract void fly();
public abstract void makeSound();
}
class Eagle extends Bird{
    @Override
    public void fly() {
        System.out.println("Eagle: Flying high in the sky.");
    }

    @Override
    public void makeSound() {
        System.out.println("Eagle: Screech! Screech!");
    }
}
class Hawk extends Bird{
    @Override
    public void fly() {
        System.out.println("Hawk: Soaring through the air.");
    }

    @Override
    public void makeSound() {
        System.out.println("Hawk: Caw! Caw!");
    }
}
class Main11{
    public static void main(String[] args) {
        Bird eagle = new Eagle();
        eagle.fly();
        eagle.makeSound();
        Bird hawk = new Hawk();
        hawk.fly();
        hawk.makeSound();
    }
}
