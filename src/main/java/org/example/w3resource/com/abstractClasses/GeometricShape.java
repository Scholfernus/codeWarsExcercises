package org.example.w3resource.com.abstractClasses;

abstract class GeometricShape {
    protected double sideA, sideB, sideH;

    public abstract double area();

    public abstract double perimeter();

    public GeometricShape(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public GeometricShape(double sideA, double sideB, double sideH) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideH = sideH;
    }

    public GeometricShape(double sideA) {
        this.sideA = sideA;
    }
}

class Triangle2 extends GeometricShape {
    public Triangle2(double sideA, double sideB, double sideH) {
        super(sideA, sideB, sideH);
    }

    @Override
    public double area() {
        double areaT = (sideA + sideB + sideH) / 2;
        return Math.sqrt(areaT * (areaT - sideA) * (areaT - sideB) * (areaT - sideH));
    }

    @Override
    public double perimeter() {
        return sideA + sideB + sideH;
    }
}

class Square extends GeometricShape {
    public Square(double sideA) {
        super(sideA);
    }

    @Override
    public double area() {

        return sideA * sideA;
    }

    @Override
    public double perimeter() {
        return 4 * sideA;
    }
}

class Main12 {
    public static void main(String[] args) {
        GeometricShape triangle = new Triangle2(5, 6, 7);
        triangle.area();
        triangle.perimeter();
        GeometricShape square = new Square(4);
        square.area();
        square.perimeter();
        System.out.println("Triangle Area: " + triangle.area());
        System.out.println("Triangle Perimeter: " + triangle.perimeter());

        System.out.println("Square Area: " + square.area());
        System.out.println("Square Perimeter: " + square.perimeter());
    }
}





