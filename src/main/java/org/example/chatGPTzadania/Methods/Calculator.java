package org.example.chatGPTzadania.Methods;

public interface Calculator {
    double add(double a, double b);

    double subtract(double a, double b);

    double multiply(double a, double b);

    double divide(double a, double b);

    class BasicCalculator implements Calculator {

        @Override
        public double add(double a, double b) {
            return a + b;
        }

        @Override
        public double subtract(double a, double b) {
            return a - b;
        }

        @Override
        public double multiply(double a, double b) {
            return a * b;
        }

        @Override
        public double divide(double a, double b) {
            if (a == 0 || b == 0) {
                throw new RuntimeException("Nie można dzielić przez 0");
            }
            return a / b;
        }
    }

    public static void main(String[] args) {
        BasicCalculator basicCalculator = new BasicCalculator();
        double add = basicCalculator.add(5, -7);
        double subtract = basicCalculator.subtract(8, 5);
        double multiply = basicCalculator.multiply(3, 8);
        double divide = basicCalculator.divide(5, 3);
        System.out.printf("Wynik dodawania = %.2f%n",add);
        System.out.printf("Wynik odejmowania = %.2f%n",subtract);
        System.out.printf("Wynik mnożenia = %.2f%n",multiply);
        System.out.printf("Wynik dzielenia = %.2f%n",divide);
    }
}
