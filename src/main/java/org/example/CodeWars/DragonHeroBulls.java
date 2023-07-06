package org.example.CodeWars;

public class DragonHeroBulls {
    public static boolean hero(int bullets, int dragons) {
        boolean isDead = true;
        if ((long)bullets >=(long) dragons * 2) {
            return isDead;
        } else {
            return !isDead;
        }
    }

    public static void main(String[] args) {
        System.out.println(hero(1200, 1300));
    }
}

// return bullets / 2 >= dragons;