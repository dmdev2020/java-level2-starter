package com.dmdev.oop.lesson2;

public class ComputerRunner {

    public static void main(String[] args) {
        int value = 5;
        Computer computer = new Computer();
        computer.load();
        System.out.println("Ram: " + computer.ram);
        System.out.println("Ssd: " + computer.ssd);
    }
}
