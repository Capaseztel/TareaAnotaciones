package com.Ejercicios.Ej3.annotation;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
public @interface Tareas {
   Tarea[] value();
}
