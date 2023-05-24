package org.example.chatGPT;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Map<String, Integer[]> studentGrades = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        String[] names = new String[]{"Adam", "Bart", "Chris", "Jimmy", "Korner", "Michael"};
        for (String name : names) {
            System.out.println("Podaj ocenę dla studenta " + name + ":");
            String input = scanner.nextLine();
            String[] gradesStr = input.split(" ");
            Integer[] grades = new Integer[gradesStr.length];
            for (int i = 0; i < grades.length; i++) {
                grades[i] = Integer.parseInt(gradesStr[i]);
            }
            studentGrades.put(name, grades);
        }
        System.out.println("Zebrane oceny studentów");
        for (Map.Entry<String, Integer[]> map : studentGrades.entrySet()) {
            String name = map.getKey();
            Integer[] grades = map.getValue();
            int sum = 0;
            for (int grade : grades) {
                sum += grade;
            }
            double average = (double) sum / grades.length;
            DecimalFormat decimalFormat = new DecimalFormat("#.0");
            String formattedAverage = decimalFormat.format(average);
            String gradesString = "";
            for (int grade : grades) {
                gradesString += grade + ", ";
            }
            gradesString = gradesString.substring(0, gradesString.length() - 2);

            System.out.println("Student: " + name + ", Oceny: " + gradesString + ", Średnia: " + formattedAverage);
        }
    }

}
