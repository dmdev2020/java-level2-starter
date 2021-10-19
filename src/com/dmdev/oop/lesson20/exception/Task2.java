package com.dmdev.oop.lesson20.exception;

/**
 * 2. Написать код, который создаст, а затем отловит
 * ArrayIndexOutOfBoundsException.
 */
public class Task2 {

    public static void main(String[] args) {
//                      0  1  2  3  4
        int[] values = {1, 4, 6, 7, 8};
        try {
            for (int i = 0; i <= values.length; i++) {
                System.out.println(values[i]);
            }
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.err.println("Catch");
            exception.printStackTrace();
        }
        System.err.println("end");
    }
}
