package com.dmdev.oop.lesson28.model;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({
        ElementType.TYPE,
        ElementType.FIELD
})
@Retention(RetentionPolicy.RUNTIME)
public @interface MinAge {

    int age();
}
