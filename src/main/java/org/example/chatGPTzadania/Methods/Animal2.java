package org.example.chatGPTzadania.Methods;

public interface Animal2 {
    void makeSound();
    void move();
}
class Dog2 implements Animal2 {

    @Override
    public void makeSound() {
        System.out.println("Pies szczeka");
    }

    @Override
    public void move() {
        System.out.println("Pies biega");
    }
}
class Bird implements Animal2 {

    @Override
    public void makeSound() {
        System.out.println("Ptak ćwierka");
    }

    @Override
    public void move() {
        System.out.println("Ptak lata");
    }

    public static void main(String[] args) {
        Animal2 dog2 = new Dog2();
        dog2.makeSound();
        dog2.move();
        Animal2 bird = new Bird();
        bird.makeSound();
        bird.move();
    }
}
