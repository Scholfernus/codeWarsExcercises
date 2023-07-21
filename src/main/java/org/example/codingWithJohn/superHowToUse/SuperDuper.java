package org.example.codingWithJohn.superHowToUse;

public class SuperDuper {
    public static void main(String[] args) {
    Cat myCat = new Cat(3,"Jimmy","Purina");
        System.out.println(myCat.age + " " + myCat.name + " " + myCat.catFoodPreference + "");
    myCat.makeNoise();
        myCat.eat();
    }
}
