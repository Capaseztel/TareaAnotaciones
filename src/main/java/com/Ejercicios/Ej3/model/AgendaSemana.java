package com.Ejercicios.Ej3.model;

import com.Ejercicios.Ej3.annotation.Tarea;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Tarea(tituloTarea = "Tarea 1", descripcion = "Descripcion 1", diaDeLaSemana = "Lunes", hora = "1:00")
@Tarea(tituloTarea = "Tarea 2", descripcion = "Descripcion 2", diaDeLaSemana = "Martes", hora = "2:00")
@Tarea(tituloTarea = "Tarea 3", descripcion = "Descripcion 3", diaDeLaSemana = "Miercoles", hora = "3:00")
@Tarea(tituloTarea = "Tarea 4", descripcion = "Descripcion 4", diaDeLaSemana = "Jueves", hora = "4:00")
@Tarea(tituloTarea = "Tarea 5", descripcion = "Descripcion 5", diaDeLaSemana = "Viernes", hora = "5:00")
public class AgendaSemana {
    private List<com.Ejercicios.Ej3.model.Tarea> tareas;

    public void setTareas(List<com.Ejercicios.Ej3.model.Tarea> tareas) {
        this.tareas = tareas;
    }

    @Override
    public String toString() {
        return "AgendaSemana{\n" +
                "tareas=\n" + tareas + "\n}";
    }
}
