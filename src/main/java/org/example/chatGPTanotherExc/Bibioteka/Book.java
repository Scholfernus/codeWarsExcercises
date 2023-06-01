package org.example.chatGPTanotherExc.Bibioteka;


import java.util.ArrayList;
import java.util.List;

public class Book {
    String title;
    String author;
    int publicationYear;
    public List<Book> bookList = new ArrayList<>();

    public Book(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
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

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public Book() {
    }

    @Override
    public String toString() {
        return "Book{" +
                " title = ' " + title.trim() + '\'' +
                ", author = ' " + author.trim() + '\'' +
                ", publicationYear = " + publicationYear +
                "} ";
    }
}
