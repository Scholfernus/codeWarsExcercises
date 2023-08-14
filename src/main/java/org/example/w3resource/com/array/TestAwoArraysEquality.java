package org.example.w3resource.com.array;

public class TestAwoArraysEquality {
    public static void main(String[] args) {
        String[] array1 = {"Germany", "Poland", "France", "USA", "Spain"};
        String[] array2 = {"Germany", "Poland", "France", "Chile", "Spain"};
        compareTwoArray(array1, array2);
    }

    static void compareTwoArray(String[] one, String[] two) {
        for (int i = 0; i < one.length; i++) {
            if (one[i].equals(two[i])) {
                System.out.println((i+1) + " Element tablicy jest taki sam.");
            }else {
                System.out.println((i+1) + " Element tablicy jest różny.");
            }
        }
    }
}
