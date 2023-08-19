package org.example.w3resource.com.abstractClasses;

abstract class Animal2 {
    public abstract void eat();

    public abstract void sleep();
}

class Lion2 extends Animal2 {
    @Override
    public void eat() {
        System.out.println("Lion eats meat.");
    }

    @Override
    public void sleep() {
        System.out.println("Lion sleeps on grassland.");
    }
}

class Tiger2 extends Animal2 {
    @Override
    public void eat() {
        System.out.println("Tiger eats meat and occasionally hunts in water.");
    }

    @Override
    public void sleep() {
        System.out.println("Tiger sleeps in a hidden spot.");
    }
}

class Deer extends Animal2 {
    @Override
    public void eat() {
        System.out.println("Deer grazes on grass and leaves.");
    }

    @Override
    public void sleep() {
        System.out.println("Deer sleeps in open fields.");
    }
}
class Main4{
    public static void main(String[] args) {
        Lion2 lion2 = new Lion2();
        lion2.eat();
        lion2.sleep();
        System.out.println();
        Tiger2 tiger2 = new Tiger2();
        tiger2.eat();
        tiger2.sleep();
        System.out.println();
        Deer deer = new Deer();
        deer.eat();
        deer.sleep();

    }
}