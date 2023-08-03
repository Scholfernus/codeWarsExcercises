package org.example.w3resource.com;

public class PrintPyramidOfNumbers {
    public static void main(String[] args) {
        String space = "  ";
        for (int i = 1; i < 10; i++) {
            for (int j = 0; j < i; j++) {

                System.out.print(space + i);
            }
            System.out.println();
        }
    }
}
