package org.example.w3resource.com.objectOrientedProgramming.exercises;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

public class Ex11 {
//    Write a Java program to create a class called "Book2" with a collection of books and methods to add and remove books.


    public static void main(String[] args) {
        Book2 book = new Book2("Wichrowe wzgórza", "Emilie Bronte", "JND67983KM", 1953);
        Book2 book2 = new Book2("Pipi Langstrum", "Towe Janson", "HY76EI0973", 1966);
        Book2 book3 = new Book2("Arsin Lupin", "Agata Christie", "BE6573JU8", 1970);

        Library library = new Library();
        library.addBooks(book);
        library.addBooks(book2);
        library.addBooks(book3);
        System.out.println(library);
        library.removeBook(book);
        System.out.println(library);
    }
}

class Library {
    private final List<Book2> booksFromLibrary = new ArrayList<>();

    public void addBooks(Book2 book) {
        booksFromLibrary.add(book);
    }

    public void removeBook(Book2 book) {
        booksFromLibrary.remove(book);
    }

    @Override
    public String toString() {
        return "Library{" +
                "books in the Library=\n" + booksFromLibrary +
                '}';
    }
}

@Getter
@Setter
class Book2 {
    private String title;
    private String author;
    private String ISBN;
    private int year;

    public Book2(String title, String author, String ISBN, int year) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Book {" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", ISBN='" + ISBN + '\'' +
                ", year=" + year +
                '}' + " \n";
    }
}