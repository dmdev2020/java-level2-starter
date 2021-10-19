package com.dmdev.oop.lesson19.hw2.task2.car;

import java.util.Objects;

public abstract class Car {
    private int year;
    private Brand brand;
    private Model model;
    private Color color;

    public Car(int year, Brand brand, Model model, Color color) {
        this.year = year;
        this.brand = brand;
        this.model = model;
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return year == car.year &&
                brand == car.brand &&
                model == car.model &&
                color == car.color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, brand, model, color);
    }

    @Override
    public String toString() {
        return "Car{" +
                "year=" + year +
                ", brand=" + brand +
                ", model=" + model +
                ", color=" + color +
                '}';
    }

    public int getYear() {
        return year;
    }

    public Brand getBrand() {
        return brand;
    }

    public Model getModel() {
        return model;
    }

    public Color getColor() {
        return color;
    }
}
