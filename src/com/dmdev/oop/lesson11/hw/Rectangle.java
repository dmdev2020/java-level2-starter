package com.dmdev.oop.lesson11.hw;

public class Rectangle {

    private Point leftUpperCorner;
    private Point rightLowerCorner;

    public Rectangle(Point leftUpperCorner, Point rightLowerCorner) {
        this.leftUpperCorner = leftUpperCorner;
        this.rightLowerCorner = rightLowerCorner;
    }

    public double getDiagonal() {
        return leftUpperCorner.distance(rightLowerCorner);
    }

    public int getArea() {
        return (rightLowerCorner.getX() - leftUpperCorner.getX()) * (leftUpperCorner.getY() - rightLowerCorner.getY());
    }
}
