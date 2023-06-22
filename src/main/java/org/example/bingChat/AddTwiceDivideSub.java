package org.example.bingChat;

public class AddTwiceDivideSub {
    public static void main(String[] args) {
        Add(5, 10);
        Sub(5, 10);
        Twice(5, 10);
        Divide(5, 10);

    }

    static void Add(int a, int b) {
        int addResult = a + b;
        System.out.printf("Suma liczb %d i %d = %d\n", a, b, addResult);
    }

    static void Sub(int a, int b) {
        int subResult = a - b;
        System.out.printf("Różnica liczb %d i %d = %d\n", a, b, subResult);
    }

    static void Twice(int a, int b) {
        int twiceResult = a * b;
        System.out.printf("Iloczyn liczb %d i %d = %d\n", a, b, twiceResult);
    }

    static void Divide(double a, double b) {
        double divideResult = (double) a / b;
        System.out.printf("Iloraz liczb %.0f i %.0f = %.2f", a, b, divideResult);
    }
}
