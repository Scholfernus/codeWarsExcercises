package org.example.genericClass;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaskList<K, V> {
    private List<TaskPair<K, V>> tasks = new ArrayList<>();

    public void addTask(K title, V completed) {
        TaskPair<K, V> task = new TaskPair<>(title, (Boolean) completed);
        tasks.add(task);
        System.out.println("Zadanie dodane.");
    }

    public void displayTasks() {
        for (TaskPair<K, V> task : tasks) {
            System.out.println("Tytuł: " + task.getFirst() + ", Wykonane: " + task.getSecond());
        }
    }

    public void markTaskAsCompleted(int index) {
        if (index >= 0 && index < tasks.size()) {
            TaskPair<K, V> task = tasks.get(index);
            task.setSecond(true);
            System.out.println("Zadanie oznaczone jako wykonane.");
        } else {
            System.out.println("Nieprawidłowy numer zadania.");
        }
    }

    public static void main(String[] args) {
        TaskList<String, Boolean> taskList = new TaskList<>();

        boolean exit = false;
        while (!exit) {
            System.out.println("Menu:");
            System.out.println("1. Dodaj zadanie");
            System.out.println("2. Wyświetl zadania");
            System.out.println("3. Oznacz zadanie jako wykonane");
            System.out.println("4. Wyjście");

            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            scanner.nextLine(); // Konsumowanie znaku nowej linii

            switch (choice) {
                case 1:
                    System.out.print("Podaj tytuł zadania: ");
                    String title = scanner.nextLine();
                    taskList.addTask(title, false);
                    break;
                case 2:
                    System.out.println("Zadania:");
                    taskList.displayTasks();
                    break;
                case 3:
                    System.out.print("Podaj numer zadania do oznaczenia jako wykonane: ");
                    int taskIndex = scanner.nextInt();
                    taskList.markTaskAsCompleted(taskIndex);
                    break;
                case 4:
                    exit = true;
                    System.out.println("Program zakończony.");
                    break;
                default:
                    System.out.println("Nieprawidłowa opcja.");
                    break;
            }
        }
    }
}

class TaskPair<K, V> {
    private K first;
    private boolean second;

    public TaskPair(K first, boolean second) {
        this.first = first;
        this.second = second;
    }

    public K getFirst() {
        return first;
    }

    public void setFirst(K first) {
        this.first = first;
    }

    public boolean getSecond() {
        return second;
    }

    public void setSecond(boolean second) {
        this.second = second;
    }
}
