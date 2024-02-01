package org.example.w3resource.com.interfaceClass.exercises;

public class Ex9 {
    //    Write a Java program to create an interface Searchable with a method search(String keyword) that searches
//    for a given keyword in a text document. Create two classes Document and WebPage that implement the Searchable
//    interface and provide their own implementations of the search() method.
    public static void main(String[] args) {

    }
}
interface Searchable{
    void search(String keyword);
}
class Document implements Searchable{

    @Override
    public void search(String keyword) {

    }
}
class WebPage implements Searchable{

    @Override
    public void search(String keyword) {

    }
}