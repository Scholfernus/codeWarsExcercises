package org.example.bingChat;

import java.util.Scanner;

public class TriangleSquare {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean continueCalculation = true;

        while (continueCalculation) {
            System.out.println("Podaj długość boku \"a\" :");
            double bokA = scanner.nextDouble();
            System.out.println("Podaj długość boku \"b\" :");
            double bokB = scanner.nextDouble();
            System.out.println("Podaj długość boku \"c\" :");
            double bokC = scanner.nextDouble();

            if (bokA <= 0 || bokB <= 0 || bokC <= 0) {
                System.out.println("Zakończ działanie programu, boki nie mogą być ujemne");
                continueCalculation = false;
            } else {
                double obw = bokA + bokB + bokC;
                double s = obw / 2;
                System.out.println("Obwód wynosi : " + obw);
                double area = Math.sqrt(s * (s - bokA) * (s - bokB) * (s - bokC));
                System.out.println("Pole wynosi " + area);

                System.out.println("Czy chcesz obliczyć dla kolejnego trójkąta? (Tak/Nie)");
                String response = scanner.next();

                if (!response.equalsIgnoreCase("Tak")) {
                    continueCalculation = false;
                }
            }
        }
    }
}

