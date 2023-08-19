package org.example.w3resource.com.abstractClasses;

abstract class Shape3D {
    protected double sideA, sideB;

    public Shape3D() {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public abstract double calculateVolume();

    public abstract double calculateSurfaceArea();

}

class Sphere extends Shape3D {
    private double sphereArea;
    private double radius;

    public Sphere(double radius) {
        super();
        this.sphereArea = sphereArea;
        this.radius = radius;
    }

    @Override
    public double calculateVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    @Override
    public double calculateSurfaceArea() {

        return 4 * Math.PI * (radius * radius);
    }
}

class Cube extends Shape3D {
    public Cube(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double calculateVolume() {
        return Math.pow(sideA, sideB);
    }

    @Override
    public double calculateSurfaceArea() {
        return 6 * (sideA * sideB);
    }
}

class Main6 {
    public static void main(String[] args) {
        Shape3D sphere = new Sphere(7.0);
        Shape3D cube = new Cube(4.0, 6.0);
        System.out.printf("Sphere Volume: %.2f\n", sphere.calculateVolume());
        System.out.printf("Sphere Surface Area: %.2f",sphere.calculateSurfaceArea());

        System.out.printf("\nCube Volume: %.2f\n",cube.calculateVolume());
        System.out.printf("Cube Surface Area: %.2f",cube.calculateSurfaceArea());
    }
}