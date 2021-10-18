package com.dmdev.oop.lesson16;

import java.util.Arrays;

public class EnumRunner {

    public static void main(String[] args) {
        ProcessorType processorType = ProcessorType.BIT_32;
        System.out.println(processorType);
        System.out.println(processorType.name());
        System.out.println(processorType.toString());
        System.out.println(ProcessorType.valueOf("BIT_32"));
        System.out.println(Arrays.toString(ProcessorType.values()));
        System.out.println(ProcessorType.BIT_32.ordinal());
        System.out.println(processorType.getName());
        System.out.println(processorType.getDescription());
    }
}
