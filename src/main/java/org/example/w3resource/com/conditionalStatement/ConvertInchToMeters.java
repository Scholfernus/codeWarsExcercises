package org.example.w3resource.com.conditionalStatement;

import java.util.Scanner;

public class ConvertInchToMeters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj długość w calach: ");
        long cal = scanner.nextLong();
        double metr = 0.0254;
        double meters = (double) cal * metr;
        System.out.println(meters);
    }
}
