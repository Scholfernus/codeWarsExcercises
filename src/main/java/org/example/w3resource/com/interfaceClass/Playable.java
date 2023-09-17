package org.example.w3resource.com.interfaceClass;

public interface Playable {
    void play();
}
class Football implements Playable{

    @Override
    public void play() {
        System.out.println("Playing football");
    }
}
class Volleyball implements Playable {
    public void play() {
        System.out.println("Playing volleyball");
        // Add code to play volleyball
    }
}
class Basketball implements Playable {
    public void play() {
        System.out.println("Playing basketball");
        // Add code to play basketball
    }
}
 class Main19 {
    public static void main(String[] args) {
        Playable football = new Football();
        Playable volleyball = new Volleyball();
        Playable basketball = new Basketball();

        football.play();
        volleyball.play();
        basketball.play();
    }
}