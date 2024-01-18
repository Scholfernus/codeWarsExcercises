package org.example.w3resource.com.abstractClasses.exercises;

public class Ex9 {
    //    Write a Java program to create an abstract class Instrument with abstract methods play() and tune().
//    Create subclasses for Glockenspiel and Violin that extend the Instrument class and implement the respective
//    methods to play and tune each instrument.
    public static void main(String[] args) {
    Instrument glock = new Glockenspiel();
    glock.play();
    glock.tune();
    Instrument violin = new Violin();
    violin.play();
    violin.tune();
    }
}
abstract class Instrument{
    public abstract void play();
    public abstract void tune();
}
class Glockenspiel extends Instrument{

    @Override
    public void play() {
        System.out.println("Glockenspiel play the music");
    }

    @Override
    public void tune() {
        System.out.println("Ta dam");
    }
}
class Violin extends Instrument{

    @Override
    public void play() {
        System.out.println("Violin play the music");
    }

    @Override
    public void tune() {
        System.out.println("Violin's playing");
    }
}