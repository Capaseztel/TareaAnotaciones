package com.Ejercicios.Ej2.annotation;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
public @interface Ofiniales {
    Oficial[] value();
}
