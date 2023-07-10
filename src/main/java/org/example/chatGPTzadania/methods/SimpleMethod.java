package org.example.chatGPTzadania.methods;

public class SimpleMethod {
    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        int sum = calculateSum(a, b);
        System.out.println("Suma liczb " + a + " i " + b + " wynosi: " + sum);
    }
    public static int calculateSum(int num1, int num2){
        return num1 + num2;
    }
}
