package com.dmdev.oop.lesson19.hw2.task2;

import com.dmdev.oop.lesson19.hw2.task2.car.Brand;
import com.dmdev.oop.lesson19.hw2.task2.car.Car;
import com.dmdev.oop.lesson19.hw2.task2.car.Model;

import java.util.HashMap;
import java.util.Map;

public class Garage {

    private final Map<Car, Integer> cars = new HashMap<>();

    public void park(Car car) {
        int oldCount = cars.getOrDefault(car, 0);
        cars.put(car, oldCount + 1);
    }

    public void departure(Car car) {
        int oldCount = cars.getOrDefault(car, 0);
        Integer newCount = oldCount == 0 ? 0 : oldCount - 1;
        cars.put(car, newCount);
    }

    public int getCarCountByBrand(Brand brand) {
        int result = 0;
        for (Map.Entry<Car, Integer> entry : cars.entrySet()) {
            if (entry.getKey().getBrand() == brand) {
                result += entry.getValue();
            }
        }
        return result;
    }

    public int getCarCountByModel(Model model) {
        int result = 0;
        for (Map.Entry<Car, Integer> entry : cars.entrySet()) {
            if (entry.getKey().getModel() == model) {
                result += entry.getValue();
            }
        }
        return result;
    }

    @Override
    public String toString() {
        return "Garage{" +
                "cars=" + cars +
                '}';
    }
}
