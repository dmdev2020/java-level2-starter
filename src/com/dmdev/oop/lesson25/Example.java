package com.dmdev.oop.lesson25;

import java.util.ArrayList;
import java.util.List;

public class Example {

    private List<Integer> list;

    public Example(List<Integer> list) {
        this.list = list;
    }

    public List<Integer> getList() {
        return new ArrayList<>(list);
    }
}
