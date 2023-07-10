package org.example.chatGPTzadania.grades;

public class Grades {
    public Grades(int[][] grades, int[] classes) {
        this.grades = grades;
        this.classes = classes;
    }

    private int[][] grades = new int[][]{};
    private int[] classes = new int[]{};

    public double calculateAveragePerStudent() {
        double middleGrade = 0;
        for (int i = 0; i < grades.length; i++) {
            double sum = 0;
            for (int j = 0; j < grades[i].length; j++) {
                sum += grades[i][j];
            }
            middleGrade += sum / grades[i].length;

        }
        return middleGrade / grades.length;
    }

    public double calculateAveragePerSubject() {
        double[] subjectAverages = new double[grades[0].length];

        for (int j = 0; j < grades[0].length; j++) {
            double sum = 0;
            for (int i = 0; i < grades.length; i++) {
                sum += grades[i][j];
            }
            subjectAverages[j] = sum / grades.length;
        }

        double totalAverage = 0;
        for (double average : subjectAverages) {
            totalAverage += average;
        }

        return totalAverage / subjectAverages.length;
    }

    public static void main(String[] args) {
        int[][] grades = {{2, 3, 4, 5}, {3, 5, 6, 4}, {3, 5, 6, 5}, {5, 4, 6, 5}, {4, 6, 3, 3}};
        int[] classes = {1, 2, 3, 4};
        Grades grades1 = new Grades(grades, classes);
        double result = grades1.calculateAveragePerStudent();
        System.out.println(result);
        double subjectAverage = grades1.calculateAveragePerSubject();
        System.out.println(subjectAverage);

    }
}
