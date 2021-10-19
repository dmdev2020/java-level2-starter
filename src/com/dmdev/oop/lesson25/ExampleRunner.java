package com.dmdev.oop.lesson25;

import java.util.ArrayList;
import java.util.List;

public class ExampleRunner {

    public static void main(String[] args) {
        Example example = new Example(new ArrayList<>());
        List<Integer> list = example.getList();
        list.add(2);

        System.out.println(example.getList());
    }
}
