package org.example.w3resource.com.objectOrientedProgramming;

import java.util.ArrayList;

class Book2 {
    private String title;
    private String author;


    public Book2(String title, String author) {
        this.title = title;
        this.author = author;
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
}
class Library{
//    public Library() {
//    }

    private ArrayList<Book2> books;

    public Library(ArrayList<Book2> books) {
        this.books = books;
    }
    public void addBook(Book2 book){
        books.add(book);
    }
    public void removeBook(Book2 book){
        books.remove(book);
    }

    public ArrayList<Book2> getBooks() {
        return books;
    }

}

class Main10{
    public static void main(String[] args) {
        Library library = new Library(new ArrayList<>());

        Book2 book1 = new Book2("Adventures of Tom Sawyer", "Mark Twain");
        Book2 book2 = new Book2("Ben Hur", "Lewis Wallace");
        Book2 book3 = new Book2("Time Machine","H.G. Wells");
        Book2 book4 = new Book2("Anna Karenina", "Leo Tolstoy");

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);

        System.out.println("Books in the library:");
        for (Book2 b:library.getBooks()) {
            System.out.println(b.getTitle() + " by " + b.getAuthor());
        }
        library.removeBook(book2);
        System.out.println("\nBooks in the library after removing " + book2.getTitle() + ":");
        for (Book2 b :library.getBooks()) {
            System.out.println(b.getTitle() + " by " + b.getAuthor());
        }
    }
}