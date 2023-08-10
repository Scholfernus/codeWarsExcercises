package org.example.w3resource.com.enumTypes;

public class Directions {
    public static enum Direction {
        NORTH,
        SOUTH,
        EAST,
        WEST
    }

    public static void main(String[] args) {
        Direction dirEast = Direction.EAST;
        Direction dirWest = Direction.WEST;
        Direction dirNorth = Direction.NORTH;
        Direction dirSouth = Direction.SOUTH;
        String[] directions = new String[]{String.valueOf(dirNorth), String.valueOf(dirSouth),
                String.valueOf(dirEast), String.valueOf(dirWest)};
        for (var str:directions) {
            System.out.println(str);
        }
    }
}
