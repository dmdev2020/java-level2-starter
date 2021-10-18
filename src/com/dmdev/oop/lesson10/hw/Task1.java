package com.dmdev.oop.lesson10.hw;

/**
 * 1. Проверить, является ли введённая строка палиндромом, т.е. читается
 * одинаково в обоих направлениях
 */
public class Task1 {

    private static final String EMPTY = "";
    private static final String SPACE = " ";

    public static void main(String[] args) {
        String value = "а роза упала на лапу Азора";
        boolean result = isPalindrome(value);
        System.out.println(result);
    }

    /**
     * Решение не идеальное, потому что надо решать его с помощью регулярных выражений. Но это отдельная тема,
     * поэтому в данном случае решение можно считать удовлетворительным
     *
     * @param value текущая строка
     * @return результат проверки, является ли текущая переданная строка полиндромом
     */
    public static boolean isPalindrome(String value) {
        String withoutSpaceValue = value.replace(SPACE, EMPTY);
        return new StringBuilder(withoutSpaceValue).reverse().toString().equalsIgnoreCase(withoutSpaceValue);
    }
}
