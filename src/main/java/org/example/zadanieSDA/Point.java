package org.example.zadanieSDA;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

public class Point {
    private String name;
    private int x;
    private int y;

    public Point(String name, int x, int y) {
        this.name = name;
        this.x = x;
        this.y = y;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return x == point.x && y == point.y && Objects.equals(name, point.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, x, y);
    }

    public String getName() {
        return name;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
    class CalculateDistance{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę punktów: ");
        int pointNumbers = scanner.nextInt();

        Map<String, Point> points = new HashMap<>();
        for (int i = 1; i <= pointNumbers; i++) {
            System.out.println("Podaj współrzędne punktu " + i + ": x i y: ");
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            Point point= new Point(x ,y);
            points.put("Punkt " + i, point);
        }
        for (String pointName : points.keySet()) {
            Point point = points.get(pointName);
            double betweenPoints = distanceBetweenPoints(point, points.get(0));
            System.out.println("Odległość: " + betweenPoints);
        }
        double distance = distanceBetweenPoints(new Point(scanner.nextInt(), scanner.nextInt()),new Point(scanner.nextInt(),scanner.nextInt()));
        System.out.println(distance);
    }
    private static double distanceBetweenPoints(Point point1, Point point2){
        int x1 = point1.getX();
        int y1 = point1.getY();
        int x2 = point2.getX();
        int y2 = point2.getY();
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
}
