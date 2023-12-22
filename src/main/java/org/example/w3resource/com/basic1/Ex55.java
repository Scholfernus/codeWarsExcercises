package org.example.w3resource.com.basic1;

import java.sql.Time;
import java.util.Scanner;

public class Ex55 {
    // Write a Java program to convert seconds to hours, minutes and seconds.
    // Input seconds: 86399  result   23:59:59
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Prompt the user to input the total seconds
        System.out.print("Input seconds: ");
        int seconds = in.nextInt();
        int restSeconds = seconds % 60;
        int hour = seconds / 60;
        int minutes = hour % 60;
        hour = hour / 60;
        System.out.println(hour + ":" + minutes + ":" + restSeconds);

    }
}
