package com.Ejercicios.Ej3.contexto;

import com.Ejercicios.Ej3.annotation.Tarea;
import com.Ejercicios.Ej3.model.AgendaSemana;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CargadorDeContexto {

    public static List<Tarea> GetTareas() {
        return Arrays.asList(AgendaSemana.class.getAnnotationsByType(Tarea.class));
    }

    public List<com.Ejercicios.Ej3.model.Tarea> cargarTareas() {
        List<com.Ejercicios.Ej3.model.Tarea> tareas = new ArrayList<>();

        for (Tarea TareaAnotada : GetTareas()) {
            com.Ejercicios.Ej3.model.Tarea tarea = new com.Ejercicios.Ej3.model.Tarea();
            tarea.setTituloTarea(TareaAnotada.tituloTarea());
            tarea.setDescripcion(TareaAnotada.descripcion());
            tarea.setDiaDeLaSemana(TareaAnotada.diaDeLaSemana());
            tarea.setHora(TareaAnotada.hora());
            tareas.add(tarea);
        }
        return tareas;
    }
}
