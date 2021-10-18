package com.dmdev.oop.lesson11;

public class Computer {

    private Ssd ssd;
    private Ram ram;

    public Computer(Ssd ssd, Ram ram) {
        super();
        this.ssd = ssd;
        this.ram = ram;
    }

    public Computer() {
        this(null, null);
    }

    public void load() {
        System.out.println("Я загрузился");
    }

    public Ssd getSsd() {
        return ssd;
    }

    public Ram getRam() {
        return ram;
    }
}
