package com.Ejercicios.Ej3.annotation;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Repeatable(Tareas.class)
@Documented
public @interface Tarea {
    String tituloTarea();
    String descripcion();
    String diaDeLaSemana();
    String hora();

}
