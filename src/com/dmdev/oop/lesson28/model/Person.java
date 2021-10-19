package com.dmdev.oop.lesson28.model;

public abstract class Person {

    private Long id;

    public Person(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                '}';
    }
}
