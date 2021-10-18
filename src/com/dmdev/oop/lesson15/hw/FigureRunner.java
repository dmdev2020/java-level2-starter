package com.dmdev.oop.lesson15.hw;

public class FigureRunner {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(new Point(0, 100), new Point(100, 10));
        Circle circle = new Circle(new Point(25, 30), 20.4);
        Triangle triangle = new Triangle(new Point(0, 0), new Point(30, 50), new Point(60, 10));
        System.out.println(rectangle);
        System.out.println(circle);
        System.out.println(triangle);
        System.out.println(ShapeUtils.isRectangle(circle));
        System.out.println(ShapeUtils.isTriangle(triangle));
        System.out.println(circle.isAreaEqual(rectangle));
    }
}
