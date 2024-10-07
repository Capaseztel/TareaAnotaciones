package com.Ejercicios.Ej1.contexto;


import com.Ejercicios.Ej1.annotation.Empleado;
import com.Ejercicios.Ej1.empleados.Operario;
import com.Ejercicios.Ej1.Empresa;
import com.Ejercicios.Ej1.empleados.Directivo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CargadorDeContexto {

    public static List<Empleado> GetAnnotations() {
        return Arrays.asList(Empresa.class.getAnnotationsByType(Empleado.class));
    }

    public List<com.Ejercicios.Ej1.empleados.Empleado> cargarEmpleados() {
        List<com.Ejercicios.Ej1.empleados.Empleado> empleados = new ArrayList<>();

        for (Empleado empleadoAnotado : GetAnnotations()) {
            String tipoEmpleado = empleadoAnotado.clase();
            switch (tipoEmpleado) {
                case "Directivo":
                    Directivo directivo = new Directivo();
                    directivo.setNombre(empleadoAnotado.nombre());
                    directivo.setCodDespacho(empleadoAnotado.codDespacho());
                    directivo.setApellidos(empleadoAnotado.apellidos());
                    directivo.setDni(empleadoAnotado.dni());
                    directivo.setTelefono(empleadoAnotado.telefono());
                    directivo.setDireccion(empleadoAnotado.direccion());
                    empleados.add(directivo);
                break;


                case "Operario":
                    Operario operario = new Operario();
                    operario.setNombre(empleadoAnotado.nombre());
                    operario.setCodTaller(empleadoAnotado.codTaller());
                    operario.setApellidos(empleadoAnotado.apellidos());
                    operario.setDni(empleadoAnotado.dni());
                    operario.setTelefono(empleadoAnotado.telefono());
                    operario.setDireccion(empleadoAnotado.direccion());
                    empleados.add(operario);
                    break;
                case "Generico":
                default:
                    com.Ejercicios.Ej1.empleados.Empleado empleado = new com.Ejercicios.Ej1.empleados.Empleado();
                    empleado.setNombre(empleadoAnotado.nombre());
                    empleado.setApellidos(empleadoAnotado.apellidos());
                    empleado.setDni(empleadoAnotado.dni());
                    empleado.setTelefono(empleadoAnotado.telefono());
                    empleado.setDireccion(empleadoAnotado.direccion());
                    empleados.add(empleado);
                    break;
            }
        }
        return empleados;
    }

}
