package org.example.genericClass;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ContactBook<K, V> {
    private List<TwoPair<K, V>> contactBooks = new ArrayList<>();

    public void addContact(K name, V telephone) {
        TwoPair<K, V> contact = new TwoPair<>(name, telephone);
        contactBooks.add(contact);
        System.out.println("Dodano kontakt.");
    }

    public void displayContacts() {
        for (TwoPair<K, V> cont : contactBooks) {
            System.out.println("Name: " + cont.getFirstElem() + ", Nr telefonu: " + cont.getSecondElem());
        }
    }

    public void searchContact(K input) {
        for (TwoPair<K, V> contact : contactBooks) {
            if (contact.getFirstElem().equals(input)) {
                System.out.println("Znaleziono kontakt: " + contact.getFirstElem() + ", Telefon: " + contact.getSecondElem());
                return;
            }
        }
        System.out.println("Nie znaleziono kontaktu o podanym imieniu.");
    }

    public static void main(String[] args) {
        ContactBook<String, String> contactBook = new ContactBook<>();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        contactBook.addContact("Adam", "357 689 142");
        contactBook.displayContacts();

        while (!exit) {
            System.out.println("Menu:");
            System.out.println("1. Dodaj kontakt");
            System.out.println("2. Wyświetl kontakty");
            System.out.println("3. Wyszukaj kontakt");
            System.out.println("4. Wyjście");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Konsumowanie znaku nowej linii

            switch (choice) {
                case 1:
                    System.out.print("Podaj imię: ");
                    String name = scanner.nextLine();
                    System.out.print("Podaj numer telefonu: ");
                    String telephone = scanner.nextLine();
                    contactBook.addContact(name, telephone);
                    break;
                case 2:
                    System.out.println("Kontakty:");
                    contactBook.displayContacts();
                    break;
                case 3:
                    System.out.print("Podaj imię do wyszukania: ");
                    String searchName = scanner.nextLine();
                    contactBook.searchContact(searchName);
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

        scanner.close();
    }
}

class TwoPair<K, V> {
    private K firstElem;
    private V secondElem;

    public TwoPair(K firstElem, V secondElem) {
        this.firstElem = firstElem;
        this.secondElem = secondElem;
    }

    public K getFirstElem() {
        return firstElem;
    }

    public void setFirstElem(K firstElem) {
        this.firstElem = firstElem;
    }

    public V getSecondElem() {
        return secondElem;
    }

    public void setSecondElem(V secondElem) {
        this.secondElem = secondElem;
    }
}
