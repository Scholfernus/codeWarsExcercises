package org.example.w3resource.com.conditionalStatement;

import java.util.Scanner;

public class ConvertTemperatureFtoC {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj temperaturę w stopniach Fahreheita:");
        double fahrenheit = scanner.nextDouble();

        double tempInCelsius = temp(fahrenheit);
        System.out.printf("Dla temperatury %.2f stopni Fahrenheita, temperatura wyrażona\nw stopniach Celsjusza wynosi %.2f", fahrenheit, tempInCelsius);
    }

    private static double temp(double fahrenheit) {
        double temp = 1;
        return (fahrenheit - 32) * 5 / 9;
    }
}
