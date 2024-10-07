package com.Ejercicios.Ej2.annotation;


import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
public @interface Directivo {
//    EmplaedoEjer2Annotation[] value();
    String nombre();
    String apellidos();
    String direccion() default "Calle Falsa 123";
    String dni();
    int telefono();
    int codDespacho();

}
