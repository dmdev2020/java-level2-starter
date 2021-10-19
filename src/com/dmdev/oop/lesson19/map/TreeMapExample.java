package com.dmdev.oop.lesson19.map;

import com.dmdev.oop.lesson19.person.Person;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {

    public static void main(String[] args) {
        Person ivan = new Person(1, "Ivan", "Ivanov");
        Person petr = new Person(29, "Petr", "Petrov");
        Person sveta = new Person(3, "Sveta", "Svetikova");
        Person sveta1 = new Person(30, "Sveta1", "Svetikova1");
        Person sveta2 = new Person(45, "Sveta2", "Svetikova2");
        Person sveta3 = new Person(10, "Sveta3", "Svetikova3");

        Map<Integer, Person> map = new TreeMap<>();
        map.put(ivan.getId(), ivan);
        map.put(petr.getId(), petr);
        map.putIfAbsent(sveta.getId(), sveta);
        map.putIfAbsent(sveta1.getId(), sveta1);
        map.putIfAbsent(sveta2.getId(), sveta2);
        map.putIfAbsent(sveta3.getId(), sveta3);

        for (Map.Entry<Integer, Person> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }
    }
}
