package org.example.chatGPT;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Map<String, Integer> studentGrades = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj imię studenta");
        String firstName = scanner.nextLine();
        System.out.println("Podaj ocenę studenta");
        int grade = scanner.nextInt();
        int[] grades = new int[]{1, 2, 3, 4, 5, 6};
        String[] names = new String[]{"Adam", "Bart", "Chris", "Jimmy", "Korner", "Michael"};
        for (int i = 0; i < studentGrades.size(); i++) {
            studentGrades.put(firstName,grade);
        }
        System.out.println(studentGrades);
    }
}
