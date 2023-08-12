package org.example.w3resource.com.array;

public class CalculateTheAverageValueOfArray {
    public static void main(String[] args) {
        int[] numbers = {1, 5, 6, 4, 9, 2, 6, 7, 1, 9, 6, 3, 4, 5, 6, 8, 10};
        int sum = 0;
        double average = 0;
        for (int num : numbers) {
            sum += num;
        }
        average = (double) sum / numbers.length;
        System.out.printf("Average of a numbers = %.2f", average);
    }
}
class Exercise4 {
    public static void main(String[] args) {

        int[] numbers = new int[]{20, 30, 25, 35, -16, 60, -100};
        //calculate sum of all array elements
        int sum = 0;
        for(int i=0; i < numbers.length ; i++)
            sum = sum + numbers[i];
        //calculate average value
        double average = sum / numbers.length;
        System.out.println("Average value of the array elements is : " + average);
    }
}
