package org.example.w3resource.com.basic1.from51to100;

public class Ex92 {
    //  Write a Java program to count the number of even and odd elements in a given array of integers.
    public static void main(String[] args) {
        int[] numbers = {2, 15, 22, 24, 456, -4, -25, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int even = 0, odd = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]%2==0){
                even++;
            }else {
                odd++;
            }
        }
        System.out.println("Even numbers = "+ even+", and odd numbers = "+odd);
    }
}
