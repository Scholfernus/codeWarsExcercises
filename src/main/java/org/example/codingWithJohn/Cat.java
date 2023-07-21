package org.example.codingWithJohn;

public class Cat implements Printable {
    public String name;
    public int age;

    public Cat() {
    }

    public void print() {
        System.out.println("Meow");
    }

    static void printThing(Printable thing) {
        thing.print("-", "!");
    }


    @Override
    public String print(String prefix, String suffix) {
        return null;
    }
}
