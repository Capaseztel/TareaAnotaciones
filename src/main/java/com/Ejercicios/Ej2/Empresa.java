package com.Ejercicios.Ej2;

import com.Ejercicios.Ej2.annotation.Directivo;
import com.Ejercicios.Ej2.annotation.Oficial;
import com.Ejercicios.Ej2.annotation.Tecnico;
import com.Ejercicios.Ej2.empleados.Empleado;

import java.util.ArrayList;
import java.util.List;

@Directivo(nombre = "Ibai", apellidos = "Llanos", dni = "11111111A", codDespacho = 2, telefono = 666223344)
@Oficial(dni = "22222222B", apellidos = "Montilla", nombre = "Kike", telefono = 777334455, categoria = "Categoria")
@Tecnico(nombre = "Jesus", apellidos = "Garcia", direccion = "Calle Real", dni = "33333333C", telefono = 888112233, perfil = "Perfil")
public class Empresa {

    private String nombre;
    List<Empleado> empleados = new ArrayList<>();


    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public Empresa setEmpleados(List<Empleado> empleados) {
        this.empleados = empleados;
        return this;
    }

    public String getNombre() {
        return nombre;
    }

    public Empresa setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    @Override
    public String toString() {
        return "Empresa: " + nombre + "\nEmpleados=\n" + empleados;
    }
}
