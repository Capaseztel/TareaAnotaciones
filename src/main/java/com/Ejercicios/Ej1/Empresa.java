package com.Ejercicios.Ej1;

import com.Ejercicios.Ej1.annotation.Empleado;

import java.util.ArrayList;
import java.util.List;

@Empleado(nombre = "Denis", apellidos = "Rodriguez", dni = "11111111A", telefono = 123456789,clase = "Directivo", codDespacho = 1)
@Empleado(nombre = "Cesar", apellidos = "Moreno", dni = "22222222B", telefono = 123456789 , direccion = "Via 1" , clase = "Operario", codTaller = 2)
@Empleado(nombre = "Adrian", apellidos = "Nuñez", dni = "33333333C", telefono = 123456789, direccion = "Calle 2", clase = "Operario", codTaller = 3)
@Empleado(nombre = "Alan", apellidos = "Guerrero", dni = "44444444D", telefono = 123456789, direccion = "Avenida 3", clase = "Generico")

public class Empresa {

    private String nombre;
    private List<com.Ejercicios.Ej1.empleados.Empleado> empleados = new ArrayList<com.Ejercicios.Ej1.empleados.Empleado>();

    public Empresa() {
    }

    public List<com.Ejercicios.Ej1.empleados.Empleado> getEmpleados() {
        return empleados;
    }

    public Empresa setEmpleados(List<com.Ejercicios.Ej1.empleados.Empleado> empleados) {
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
