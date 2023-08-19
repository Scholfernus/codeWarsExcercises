package org.example.w3resource.com.abstractClasses;

abstract class Shape2D {
    public abstract void draw();

    public abstract void resize();
}

class Rectangle extends Shape2D {
    @Override
    public void draw() {
        System.out.println("Rectangle: Drawing a rectangle.");
    }

    @Override
    public void resize() {
        System.out.println("Rectangle: Resizing the rectangle.");
    }
}

class Circle2 extends Shape2D {
    @Override
    public void draw() {
        System.out.println("Circle: Drawing a circle.");
    }

    @Override
    public void resize() {
        System.out.println("Circle: Resizing the circle.");
    }
}

class Main10 {
    public static void main(String[] args) {
        Shape2D rectangle = new Rectangle();
        rectangle.draw();
        rectangle.resize();
        Shape2D circle = new Circle2();
        circle.draw();
        circle.resize();
    }
}