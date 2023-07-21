package org.example.codingWithJohn.superHowToUse;

import org.w3c.dom.ls.LSOutput;

public class Cat extends Animal{
    String catFoodPreference;

    public Cat(String catFoodPreference) {
        this.catFoodPreference = catFoodPreference;
    }

    public Cat(int age, String name, String catFoodPreference) {
        super(age, name);
        this.catFoodPreference = catFoodPreference;
    }

    @Override
    public void makeNoise() {
        super.makeNoise();
        System.out.println("Meow meow meow !");
        eat();
    }

}
