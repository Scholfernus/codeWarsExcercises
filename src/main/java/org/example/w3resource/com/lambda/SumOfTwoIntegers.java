package org.example.w3resource.com.lambda;

import com.google.common.base.Supplier;

import java.util.function.IntSupplier;

public class SumOfTwoIntegers implements SumCalculator {
    private static int a = 8;
    private static int b = 2;
    private static int sum = 0;

    public static void main(String[] args) {
        SumCalculator sumCalculator = (x, y) -> x + y;
        int result = sumCalculator.sum(7, 6);
        System.out.println("Suma liczb 7 i 6 = " + result);
        result = sumCalculator.sum(15, -35);
        System.out.println("Suma liczb 15 i -35 = " + result);
    }

    @Override
    public int sum(int a, int b) {
        return 0;
    }
}
