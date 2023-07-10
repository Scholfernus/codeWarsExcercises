package org.example.chatGPTzadania.methods;

public class SumaLiczbParzystychTablicy {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 8, 1, 9, -4};
        calculateEvenSum(numbers);
    }
    public static void calculateEvenSum(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                sum +=numbers[i];
            }
        }
        System.out.println("Suma liczb parzystych tablicy wynosi: " + sum);
    }
}
