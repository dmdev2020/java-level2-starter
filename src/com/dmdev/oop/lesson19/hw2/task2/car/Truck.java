package com.dmdev.oop.lesson19.hw2.task2.car;

import java.util.Objects;

public class Truck extends Car {

    private double liftingCapacity;

    public Truck(int year, Brand brand, Model model, Color color, double liftingCapacity) {
        super(year, brand, model, color);
        this.liftingCapacity = liftingCapacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Truck truck = (Truck) o;
        return Double.compare(truck.liftingCapacity, liftingCapacity) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), liftingCapacity);
    }

    @Override
    public String toString() {
        return "Truck{" +
                "liftingCapacity=" + liftingCapacity +
                "} " + super.toString();
    }

    public double getLiftingCapacity() {
        return liftingCapacity;
    }
}
