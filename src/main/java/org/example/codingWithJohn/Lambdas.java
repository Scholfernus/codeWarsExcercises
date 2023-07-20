package org.example.codingWithJohn;

public class Lambdas {
    public static void main(String[] args) {
//    Cat myCat = new Cat();
    myCat.print();
    }
    public interface Printable{
        void print();
    }
    public class Cat implements Printable{
        public String name;
        public int age;
        public Cat(){};
        @Override
        public void print() {

        }
    }
}
