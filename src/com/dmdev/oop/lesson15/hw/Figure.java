package com.dmdev.oop.lesson15.hw;

public abstract class Figure {

    public boolean isAreaEqual(Figure figure) {
        return getArea() == figure.getArea();
    }

    public abstract double getArea();
}
