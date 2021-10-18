package com.dmdev.oop.lesson11.hw;

public class FigureRunner {

    public static void main(String[] args) {
        Point point1 = new Point(2, 10);
        Point point2 = new Point(12, 4);

        System.out.println(point1.distance(point2));
        System.out.println(point2.distance(point1));

        Rectangle rectangle = new Rectangle(point1, point2);
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getDiagonal());
    }
}
