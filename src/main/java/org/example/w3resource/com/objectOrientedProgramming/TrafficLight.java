package org.example.w3resource.com.objectOrientedProgramming;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class TrafficLight {
    private String color;
    private int duration;

    public TrafficLight(String color, int duration) {
        this.color = color;
        this.duration = duration;
    }

    public void changeColor(String newColor) {
        color = newColor;
    }

    public boolean isRed() {
        return color.equals("red");
    }

    public boolean isGreen() {
        return color.equals("red");
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

}

class Main7 {
    public static void main(String[] args) {


        TrafficLight light = new TrafficLight("red", 30);
        System.out.println("The light is red: " + light.isRed());
        System.out.println("The light is green: " + light.isGreen());
        light.changeColor("green: ");

        System.out.println("The light is now green: " + light.isGreen());
        System.out.println("The light duration is: " + light.getDuration());
        light.setDuration(20);
        System.out.println("The light duration is now: " + light.getDuration());
    }
}