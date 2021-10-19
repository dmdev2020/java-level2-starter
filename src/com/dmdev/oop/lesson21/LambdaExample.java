package com.dmdev.oop.lesson21;

import java.util.Comparator;

public class LambdaExample {

    public static void main(String[] args) {
//        Comparator<Integer> comparator = new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return 0;
//            }
//        };
        Comparator<Integer> comparator = Integer::compare;

        System.out.println(comparator.compare(25, 100));
    }

//    private static class IntegerComparator implements Comparator<Integer> {

//        @Override
//        //[модиф.] возвр название([параметры])

//        (Integer o1, Integer o2) -> {
//            return Integer.compare(o1, o2);
//        }
//    }
}
