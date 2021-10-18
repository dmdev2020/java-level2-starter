package com.dmdev.oop.lesson11;

public abstract class Computer {

    private Ssd ssd;
    private Ram ram;

    {
        System.out.println("init block computer");
    }

    static {
        System.out.println("static block computer");
    }

    public Computer(Ssd ssd, Ram ram) {
        super();
        this.ssd = ssd;
        this.ram = ram;
    }

    public Computer() {
        this(null, null);
        System.out.println("Constructor computer");
    }

    public abstract void load();

//    public void load() {
//        System.out.println("Я загрузился");
//    }

    public Ssd getSsd() {
        return ssd;
    }

    public Ram getRam() {
        return ram;
    }
}
