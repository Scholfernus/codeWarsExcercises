package org.example.codingWithJohn;

import static org.example.codingWithJohn.Cat.printThing;

public class Lambdas {
    public static void main(String[] args) {
        Cat myCat = new Cat();
        myCat.print();
        printThing(myCat);
        printThing((p, s) -> "Meow" + s);
        Printable lambdaPrintable = (p, s) -> (p + "Meow" + s);
        printThing(lambdaPrintable);
    }
}


