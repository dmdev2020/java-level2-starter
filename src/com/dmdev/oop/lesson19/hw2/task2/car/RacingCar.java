package com.dmdev.oop.lesson19.hw2.task2.car;

import java.util.Objects;

public class RacingCar extends Car {

    private int maxSpeed;

    public RacingCar(int year, Brand brand, Model model, Color color, int maxSpeed) {
        super(year, brand, model, color);
        this.maxSpeed = maxSpeed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        RacingCar racingCar = (RacingCar) o;
        return maxSpeed == racingCar.maxSpeed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), maxSpeed);
    }

    @Override
    public String toString() {
        return "RacingCar{" +
                "maxSpeed=" + maxSpeed +
                "} " + super.toString();
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }
}
