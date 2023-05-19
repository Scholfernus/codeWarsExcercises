package org.example.genericClass;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaskManager {
    private String title;
    private String description;

    public TaskManager() {
    }

    List<Task> tasks = new ArrayList<>();

    public TaskManager(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public void addTask(String title, String description) {
        Task task = new Task(title, description);
        tasks.add(task);
        System.out.println("Zadanie dodane.");
    }

    public void removeTask(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.remove(index);
            System.out.println("Zadanie usunięte.");
        } else {
            System.out.println("Nieprawidłowy numer zadania.");
        }
    }

    public void displayTasks() {
        if (tasks.isEmpty()) {
            System.out.println("Brak zadań");
        } else {
            System.out.println("lista zadań: ");
            for (int i = 0; i < tasks.size(); i++) {
                Task tasksList = tasks.get(i);
                System.out.println((i + 1) + ". Tytuł: " + tasksList.getTitle() + " \\Opis:-> " + tasksList.getDescription());
            }
        }
    }

    public static void main(String[] args) {
        TaskManager todoList = new TaskManager();
        Scanner input = new Scanner(System.in);
        boolean exit = true;
        while (exit) {
            System.out.println("Menu:\n" +
                    "1. Dodaj zadanie\n" +
                    "2. Usuń zadanie\n" +
                    "3. Wyświetl zadania\n" +
                    "4. Wyjście");
            System.out.println("Wybierz opcję: ");
            int choice = input.nextInt();
            switch (choice) {
                case 1:
//                    int number = input.nextInt();
                    input.nextLine();
                    System.out.println("Podaj tytuł zadania: ");
                    String titleInput = input.nextLine();
                    System.out.println("Podaj opis zadania: ");
                    String opisInput = input.nextLine();
                    todoList.addTask(titleInput, opisInput);
                    break;
                case 2:
                    System.out.println("Podaj numer zadania do usunięcia: ");
                    int toRemove = input.nextInt();
                    todoList.removeTask(toRemove);
                    System.out.println("Zadanie usunięte: ");
                    break;
                case 3:
                    todoList.displayTasks();
                    break;
                case 4:
                    exit = false;
                    System.out.println("Koniec programu:");
                    break;
                default:
                    System.out.println("Nieprawidłowa opcja. ");
                    break;
            }
        }
    }
}

class Task {
    private String title;
    private String description;

    public Task(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }
}