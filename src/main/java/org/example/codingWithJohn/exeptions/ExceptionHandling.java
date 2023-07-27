package org.example.codingWithJohn.exeptions;

public class ExceptionHandling {
    public static void main(String[] args) {
        try {
            getAnInt();
        } catch (NumberFormatException | NullPointerException e) {
            System.out.println("Hey, You can't make an int out of that");
        } finally {
            System.out.println("In the final block");
        }
        System.out.println("End Here");
    }

    private static void getAnInt() {
        int myInt = Integer.parseInt("pants");

    }
}
