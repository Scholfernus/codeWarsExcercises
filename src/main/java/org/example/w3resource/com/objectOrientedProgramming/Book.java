package org.example.w3resource.com.objectOrientedProgramming;

import java.util.ArrayList;
import java.util.List;

public class Book {

    private String title;
    private String author;
    private String ISBN;
    private static ArrayList<Book> bookCollection = new ArrayList<Book>();

    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public static void addBook(Book book) {
        bookCollection.add(book);
    }

    public static void removeBook(Book book) {
        bookCollection.remove(book);
    }

    public static ArrayList<Book> getBookCollection() {
        return bookCollection;
    }
}

class Main4 {
    public static void main(String[] args) {
        Book book1 = new Book("War", "Dostojewski", "12354HN45TE");
        Book book2 = new Book("An Introduction to Python", "Guido van Rossum", "9355423489");
        Book.addBook((book1));
        Book.addBook(book2);
        ArrayList<Book> bookCollection = Book.getBookCollection();
        System.out.println("List of books: ");
        for (Book book : bookCollection) {
            System.out.println(book.getTitle() + " by " + book.getAuthor() + ", ISBN " + book.getISBN());
            Book.removeBook(book1);
            System.out.println("\nAfter removing " + book1.getTitle() + ": ");
            System.out.println("List of books:");
            for (Book books : bookCollection) {
                System.out.println(books.getTitle() + " by " + books.getAuthor() + ", ISBN: " + books.getISBN());
            }
        }
        //        myLibrary.add("Harry 5", "Rowling", "23GJRTOKJ#");
    }
}
