package org.example.bingChat;

import java.util.Scanner;

public class TriangleInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj 3 dowolne cyfry:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if (a+b>c || a+c>b || b+c>a){
            System.out.printf("Z liczb %d, %d, %d można utworzyć trójkąt.",a,b,c);
        }else{
            System.out.printf("Z liczb %d, %d, %d nie można utworzyć trójkąta.",a,b,c);
        }
    }
}
