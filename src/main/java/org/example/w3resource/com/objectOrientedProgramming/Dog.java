package org.example.w3resource.com.objectOrientedProgramming;

public class Dog {
    private String name;
    private String breed;

    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}

class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Alex", "Pedigree");
        Dog dog2 = new Dog("Mike", "Eucanuba");
        System.out.println(dog1.getName() + " is eating " + dog1.getBreed() + " before.");
        System.out.println(dog2.getName() + " is eating " + dog2.getBreed() + " before.");
        dog1.setName("Zibi");
        dog1.setBreed("Chitos");
        dog2.setName("Obama");
        dog2.setBreed("cakes");
        System.out.println(dog1.getName() + " is eating " + dog1.getBreed());
        System.out.println(dog2.getName() + " is eating " + dog2.getBreed());
    }
}
