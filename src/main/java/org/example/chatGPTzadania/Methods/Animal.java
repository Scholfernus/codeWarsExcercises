package org.example.chatGPTzadania.Methods;

public interface Animal {
    void eat();
    void sleep();
}
class Dog implements Animal{
    @Override
    public void eat() {
        System.out.println("Pies je kość");
    }
    @Override
    public void sleep() {
        System.out.println("Pies śpi");
    }
}
class Cat implements Animal {

    @Override
    public void eat() {
        System.out.println("Kot pije mleko");
    }

    @Override
    public void sleep() {
        System.out.println("Kot chrapie");
    }
}
class AnimalDemo {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.eat();
        dog.sleep();

        Animal cat = new Cat();
        cat.eat();
        cat.sleep();
    }
}