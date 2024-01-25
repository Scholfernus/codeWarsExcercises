package org.example.w3resource.com.objectOrientedProgramming.exercises;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

public class Ex5 {
    //    Write a Java program to create a class called "Book" with attributes for title, author, and ISBN,
//    and methods to add and remove books from a collection.
    public static void main(String[] args) {
        Book book = new Book("King", "Steven King", "ABS34598HG");
        Book book2 = new Book("Kong", "Kurosava", "BYD9087623K");
        Book book3 = new Book("Lion", "Luther", "GD4534*IH");
        List<Book> bookList = new ArrayList<Book>();
        bookList.add(book);
        book2.addBook(bookList,book2);
        book3.addBook(bookList,book3);
        for (var b : bookList) {
            System.out.println(b);
        }
        System.out.println();
        book2.removeBook(bookList,book2);
        for (var b : bookList) {
            System.out.println(b);
        }
    }
}

@Getter
@Setter
@AllArgsConstructor
class Book {
    private String title;
    private String author;
    private String ISBN;

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", ISBN='" + ISBN + '\'' +
                '}';
    }
    public void addBook(List<Book> list, Book book){
        list.add(book);
    }
    public void removeBook(List<Book> list, Book book){
        list.remove(book);
    }
}
