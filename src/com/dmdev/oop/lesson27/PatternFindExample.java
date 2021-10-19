package com.dmdev.oop.lesson27;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternFindExample {

    public static void main(String[] args) {
        String phoneNumber = "sddfg +375 (33) 898-33-13 sdfsdfsdf sdfsdg +375 (44) 777-12-13" +
                "sdsdf +375 (29) 657-13-29 sdfgsfgd +375 (25) 111-11-11 sdf";
        String regex = "(?:\\+375)? ?\\((?<code>\\d{2})\\) ?\\d{3}-\\d{2}-\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phoneNumber);
        while (matcher.find()) {
            System.out.println(matcher.group());
            System.out.println(matcher.group(0));
            System.out.println(matcher.group("code"));
        }
    }
}
