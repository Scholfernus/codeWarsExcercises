package org.example.w3resource.com.interfaceClass.exercises;

public class Ex8 {
    //    Write a Java program to create an interface Playable with a method play() that takes no arguments and returns void.
//    Create three classes Football, Volleyball, and Basketball that implement the Playable interface and override
//    the play() method to play the respective sports.
    public static void main(String[] args) {
        Playable football = new Football();
        Playable volleyball = new Volleyball();
        Playable basketball = new Basketball();
        football.play();
        volleyball.play();
        basketball.play();
    }
}
interface Playable{
    void play();
}
class Football implements Playable{

    @Override
    public void play() {
        System.out.println("Playing football");
    }
}
class Volleyball implements Playable{

    @Override
    public void play() {
        System.out.println("Playing volleyball");
    }
}
class Basketball implements Playable{

    @Override
    public void play() {
        System.out.println("Playing basketball");
    }
}