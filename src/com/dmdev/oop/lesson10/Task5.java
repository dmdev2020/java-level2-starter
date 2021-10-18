package com.dmdev.oop.lesson10;

import java.util.Arrays;

/**
 * 5. Написать функцию, разбивающую строку на равные части по n символов и
 * сохраняющую отдельные части в массив. Вывести этот массив.
 */
public class Task5 {

    public static void main(String[] args) {
        String value = "34567890";
        int n = 3;
        String[] result = split(value, n);
        System.out.println(Arrays.toString(result));
    }

    public static String[] split(String value, int n) {
        int arraySize = (int) Math.ceil(value.length() / (double) n);
        String[] result = new String[arraySize];
        int counter = 0;
        for (int i = 0; i < value.length(); i += n) {
            int endIndex = Math.min(value.length(), i + n);
            String substring = value.substring(i, endIndex);
            result[counter] = substring;
            counter++;
        }

        return result;
    }
}
