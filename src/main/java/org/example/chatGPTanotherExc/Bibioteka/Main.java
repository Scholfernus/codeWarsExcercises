package org.example.chatGPTanotherExc.Bibioteka;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        List<Book> bookList = new ArrayList<>();
        Book book = new Book("Zbrodnia i kara", "Fiodor Dostojewski", 1998);
        bookList.add(book);

        Book book1 = new Book("Killing Zone", "Mc Guire", 1978);
        bookList.add(book1);

        Book book2 = new Book("Death Zone", "Mc Donalds", 1955);
        bookList.add(book2);

        Book book3 = new Book("Dancing with tears in my eyes", "Ultravox", 1984);
        bookList.add(book3);

        for (Book b : bookList) {
            System.out.println(b);
        }
        System.out.println();
        Book book4 = new Book();
        book4.setAuthor("Marco Polo");
        book4.setTitle("Around the world");
        book4.setPublicationYear(1844);
        bookList.add(new Book("The Driven", "String Driven Thing", 1977));
        for (Book b : bookList) {
            System.out.println(b);
        }
        library.displayBooks(book);
    }
}
