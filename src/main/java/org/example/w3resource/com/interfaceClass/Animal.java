package org.example.w3resource.com.interfaceClass;

public interface Animal {
    public void bark();
}

class Dog implements Animal {

    @Override
    public void bark() {
        System.out.println("Dog is barking");
    }
}

class Main17 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.bark();
    }
}
