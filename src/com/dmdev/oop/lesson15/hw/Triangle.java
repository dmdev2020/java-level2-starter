package com.dmdev.oop.lesson15.hw;

public class Triangle extends Figure implements WithPerimeter, WithHeight {

    private final Point point1;
    private final Point point2;
    private final Point point3;

    public Triangle(Point point1, Point point2, Point point3) {
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
    }

    @Override
    public double getHeight() {
        double side1 = getSide(point1, point2);
        return 2 * getArea() / side1;
    }

    @Override
    public double getArea() {
        double side1 = getSide(point1, point2);
        double side2 = getSide(point2, point3);
        double side3 = getSide(point3, point1);
        double semiPerimeter = getSemiPerimeter();
        return Math.sqrt(semiPerimeter * (semiPerimeter - side1) * (semiPerimeter - side2) * (semiPerimeter - side3));
    }

    @Override
    public double getPerimeter() {
        return getSide(point1, point2) + getSide(point2, point3) + getSide(point3, point1);
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "point1=" + point1 +
                ", point2=" + point2 +
                ", point3=" + point3 +
                "}";
    }

    public Point getPoint1() {
        return point1;
    }

    public Point getPoint2() {
        return point2;
    }

    public Point getPoint3() {
        return point3;
    }
}
