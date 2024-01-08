package org.example.w3resource.com.enumTypes.exercises;

public class Ex4 {
    //    Write a Java program to implement an enum called "Direction" with constants representing
//    the cardinal directions (North, South, East, West).
    enum EarthDirection{
        NORTH,
        SOUTH,
        EAST,
        WEST
    }
    public static void main(String[] args) {
        EarthDirection west = EarthDirection.WEST;
        EarthDirection south = EarthDirection.SOUTH;
        System.out.println("I'm going to the " + west);
        System.out.println("You're going to the " + south);
    }
}
