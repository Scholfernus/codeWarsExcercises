package org.example.genericClass;

public class ExampleGenericClass {
    public static void main(String[] args) {
        Printer<Integer> printer = new Printer<>(93);
        printer.print();
        Printer<Double>doublePrinter = new Printer<>(33.3);
        doublePrinter.print();
        shout("John");
        shout(57);
    }
    private static <T> void shout(T thingToShout){
        System.out.println(thingToShout + "!!!!");
    }
}
class Printer<T> {
    T thingToPrint;

    public Printer(T thingToPrint) {
        this.thingToPrint = thingToPrint;
    }
    public void print(){
        System.out.println(thingToPrint);
    }
}