package org.example.w3resource.com.basic1.from51to100;

public class Ex90 {
    //    Write a Java program to get the value of environment variables PATH, TEMP, USERNAME.
    public static void main(String[] args) {
        System.out.println("Environment variable PATH: ");
        System.out.println(System.getenv("Path"));
        System.out.println("Environment variable TEMP: ");
        System.out.println(System.getenv("Temp"));
        System.out.println("Environment variable USERNAME: ");
        System.out.println(System.getenv("UserName"));
    }
}
