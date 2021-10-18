package com.dmdev.oop.lesson7;

public class CompositionRunner {

    public static void main(String[] args) {
        int ramValue = 1000;
        Ram ram = new Ram(ramValue);
        Ssd ssd = new Ssd(500);
        Computer computer = new Computer(ram, ssd);
        computer.printState();

        Ram ram2 = new Ram(512);
        computer.setRam(ram2);
    }
}
