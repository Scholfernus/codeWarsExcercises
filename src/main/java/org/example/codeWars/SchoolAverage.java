package org.example.codeWars;

public class SchoolAverage {
    public static void main(String[] args) {
        int[] avr = new int[]{1, 2, 3, 4, 5};
        System.out.println(getAverage(avr));
    }

    public static int getAverage(int[] marks) {
        int average = 0;
        for (int i = 0; i < marks.length; i++) {
            average +=marks[i];
        }
        return average/ marks.length;
    }
}

// return Arrays.stream(marks).sum() / marks.length;

//