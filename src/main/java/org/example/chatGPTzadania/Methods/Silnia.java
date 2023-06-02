package org.example.chatGPTzadania.Methods;

public class Silnia {
    public static void main(String[] args) {
        Silnia silnia = new Silnia();
        int sum = silnia.calculateFactorial(5);
        System.out.println(sum);
    }

    public int calculateFactorial(int n) {
        if (n == 0) {
            return 1;
        }
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
