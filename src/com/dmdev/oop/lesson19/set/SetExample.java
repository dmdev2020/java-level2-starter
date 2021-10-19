package com.dmdev.oop.lesson19.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

    public static void main(String[] args) {
        new HashSet<>();
        new LinkedHashSet<>();
        Set<String> set = new TreeSet<>();
        System.out.println(set.add("ddd"));
        System.out.println(set.add("aaa"));
        System.out.println(set.add("bbb"));
        System.out.println(set.add("ccc"));
        System.out.println(set.add("bbb"));

        System.out.println(set);

        for (String value : set) {
            System.out.println(value);
        }
    }
}
