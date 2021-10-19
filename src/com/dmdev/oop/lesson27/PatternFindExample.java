package com.dmdev.oop.lesson27;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternFindExample {

    public static void main(String[] args) {
        String phoneNumber = "sddfg +375 (33) 898-33-13 sdfsdfsdf sdfsdg +375 (44) 777-12-13" +
                "sdsdf +375 (29) 657-13-29 sdfgsfgd +375 (25) 111-11-11 sdf";
        String regex = "(?:\\+375)? ?\\((?<code>\\d{2})\\) ?(\\d{3})-(\\d{2})-(\\d{2})";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phoneNumber);
        StringBuilder stringBuilder = new StringBuilder();
        while (matcher.find()) {
            String gr1 = matcher.group(2);
            String gr2 = matcher.group(3);
            String gr3 = matcher.group(4);
            matcher.appendReplacement(stringBuilder, "$2 - $3 - $4");
        }
        matcher.appendTail(stringBuilder);

        System.out.println(stringBuilder);
        System.out.println(phoneNumber.replaceAll(regex, "$2 - $3 - $4 | "));
    }
}
