package org.example.w3resource.com.objectOrientedProgramming.exercises;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

public class Ex2 {
    //    Write a Java program to create a class called "Dog" with a name and breed attribute.
    //    Create two instances of the "Dog" class, set their attributes using the constructor and modify the attributes
    //    using the setter methods and print the updated values.

    public static void main(String[] args) {
        Dog dog1 = new Dog("Rex", "Labrador");
        Dog dog2 = new Dog("Pinokyo", "Boxer");
        System.out.println(dog1.getName() + " " + dog1.getBreed());
        dog1.setName("Zombie");
        dog1.setBreed("Pincher");
        System.out.println(dog1.getName() + " " + dog1.getBreed());
        dog2.setName("Lala");
        dog2.setBreed("Husky");
        System.out.println(dog2.getName() + " " + dog2.getBreed());

        }
}

@Getter
@Setter
@AllArgsConstructor
class Dog {
    private String name;
    private String breed;
}
