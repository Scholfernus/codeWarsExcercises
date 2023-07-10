package org.example.chatGPTzadania.methods;

public class AverageInteger {
    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 8, 10};
        double average = calculateAverage(numbers);
        System.out.println("Średnia: " + average);
    }

    public static double calculateAverage(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        double result = (double) sum / numbers.length;
        return result;
    }
}
