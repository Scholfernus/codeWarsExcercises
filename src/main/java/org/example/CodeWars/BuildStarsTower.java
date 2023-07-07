package org.example.CodeWars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BuildStarsTower {
    public static String[] towerBuilder(int nFloors) {
        List<String> starTower = new ArrayList<>();
        for (int i = 1; i <= nFloors; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 1; j < nFloors - i; j++) {
                sb.append(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                sb.append("*");
            }
            for (int j = 1; j <= nFloors - i; j++) {
                sb.append(" ");
            }
            starTower.add(sb.toString());
        }
        return starTower.toArray(new String[0]);
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(towerBuilder(6)));
    }
}
