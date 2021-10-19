package com.dmdev.oop.lesson19.hw2.task2.car;

import java.util.Objects;

public class Bus extends Car {

    private int passengerAmount;

    public Bus(int year, Brand brand, Model model, Color color, int passengerAmount) {
        super(year, brand, model, color);
        this.passengerAmount = passengerAmount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Bus bus = (Bus) o;
        return passengerAmount == bus.passengerAmount;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), passengerAmount);
    }

    @Override
    public String toString() {
        return "Bus{" +
                "passengerAmount=" + passengerAmount +
                "} " + super.toString();
    }

    public int getPassengerAmount() {
        return passengerAmount;
    }
}
