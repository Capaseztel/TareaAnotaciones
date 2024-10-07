package com.Ejercicios.Ej2.annotation;


import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)

public @interface Empleado {
    String nombre();
    String apellidos();
    String direccion() default "Calle Falsa 123";
    String dni();
    int telefono();
}
