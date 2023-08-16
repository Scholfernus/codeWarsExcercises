package org.example.w3resource.com.inheritance;

public class Animal2 {
    public void move(){
        System.out.println("Zwierzę się porusza. ");
    }
}
class Gepard extends Animal2{
    @Override
    public void move() {
        System.out.println("Gepard biegnie. ");
    }
}
class Main6{
    public static void main(String[] args) {
        Animal2 animal2 = new Animal2();
        animal2.move();
        Gepard gepard = new Gepard();
        gepard.move();
    }
}