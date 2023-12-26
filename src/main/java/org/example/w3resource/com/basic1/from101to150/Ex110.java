package org.example.w3resource.com.basic1.from101to150;

public class Ex110 {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            for (int j = i; j < 10; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        int num1 = 64;
        int num2 = 6;

        System.out.println(num1 + " is a power of 4: " + isPowerOfFour(num1));
        System.out.println(num2 + " is a power of 4: " + isPowerOfFour(num2));
    }

    private static boolean isPowerOfFour(int num) {
        if (num <= 0) {
            return false;
        }

        while (num > 1) {
            if (num % 4 != 0) {
                return false;
            }
            num /= 4;
        }

        return true;
    }
}

