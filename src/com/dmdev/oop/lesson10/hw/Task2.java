package com.dmdev.oop.lesson10.hw;

/**
 * 2. Написать программу, преобразующую строку, содержащую число в
 * римском формате, в число в арабском формате.
 * Границы чисел: от 1 до 3999. Предусмотреть случай, когда меньший символ
 * идёт перед большим:
 * Например CM == 900.
 * Соответствие:
 * M 1000            
 * D 500            
 * C 100            
 * L 50
 * X 10
 * V 5
 * I 1
 */
public class Task2 {

    public static void main(String[] args) {
        String value = "CM";
        int result = convertToArabic(value);
        System.out.println(result);
    }

    public static int convertToArabic(String romanNumber) {
        int prevArabic = getArabic(romanNumber.charAt(romanNumber.length() - 1));
        int result = prevArabic;
        for (int i = romanNumber.length() - 2; i >= 0; i--) {
            int currentArabic = getArabic(romanNumber.charAt(i));
            result += currentArabic < prevArabic ? -currentArabic : currentArabic;
            prevArabic = currentArabic;
        }

        return result;
    }

    /**
     * Здесь представлена реализация нового switch, но можно реализовать и старым способом, логика от этого не изменится.
     *
     * @param romanChar число в римском формате
     * @return число в арабском формате
     */
    public static int getArabic(char romanChar) {
        return switch (romanChar) {
            case 'M' -> 1000;
            case 'D' -> 500;
            case 'C' -> 100;
            case 'L' -> 50;
            case 'X' -> 10;
            case 'V' -> 5;
            case 'I' -> 1;
            default -> 0;
        };
    }
}
