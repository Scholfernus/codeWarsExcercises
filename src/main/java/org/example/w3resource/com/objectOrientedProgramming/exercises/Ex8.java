package org.example.w3resource.com.objectOrientedProgramming.exercises;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Timer;

public class Ex8 {
//    Write a Java program to create class called "TrafficLight" with attributes for color and duration,
//    and methods to change the color and check for red or green.

    public static void main(String[] args) throws InterruptedException {
    TrafficLight traffic = new TrafficLight("green",10000);
    traffic.changeColor();

    }
}
@Getter
@Setter
@AllArgsConstructor
class TrafficLight{
    private String color;
    private int duration;

    public void changeColor() throws InterruptedException {
        while (true) {
            if (color.equals("green")) {
                Thread.sleep(duration);
                System.out.println("The light is green. Start");
                setColor("orange");
            }
            if (color.equals("orange")) {
                Thread.sleep(duration);
                System.out.println("The light is orange. Attention");
                setColor("red");
            }
            if (color.equals("red")) {
                Thread.sleep(duration);
                System.out.println("The light is red. Stop!");
                setColor("green");
            }
        }
    }
    public boolean checkGreen(){
        return color.equals("green");
    }
    public boolean checkRed(){
        return color.equals("red");
    }
}