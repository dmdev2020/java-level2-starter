package com.dmdev.oop.lesson27.task;

/**
 * 3. Написать программу, выполняющую поиск в строке всех тегов
 * абзацев, в т.ч. тех, у которых есть параметры, например <p id
 * ="p1">,
 * и замену их на простые теги абзацев <p>.
 */
public class Task3 {

    public static void main(String[] args) {
        String regex = "(<p .+?>)(.+?</p>)";
        String input = "<p>asdf sfdgsdfg </p> <b> asdf </b> asdfsdfg sdfgsdf <p id=\"p1\">sadfsd sdfg</p>" +
                "sfsdf <p>asdf sdffg <p id=\"p2\">2133 df</p> dsfg";
        System.out.println(input.replaceAll(regex, "<p>$2"));
    }
}
