package org.example.kamilBrzezinski.wydatki;

import java.util.Scanner;

public class ExpensesApp {
    public void start() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Wyśwetl wszystkie wydatki");
            System.out.println("2. Wyświetl wydatki z wybranego miesiąca");
            System.out.println("3. Dodaj wydatki.");
            System.out.println("4. Zakończ aplikację.");
            System.out.println("Wybierz opcję: ");

            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice){
                case 1:
                    System.out.println("Wyświetl wydatki");
                    break;
                case 2:
                    System.out.println("Wydatki z danego miesiąca");
                    break;
                case 3:
                    System.out.println("Dodawanie wydatku");
                    break;
                case 4:

                    scanner.close();
                    System.exit(0);
            }
        }
    }
}
