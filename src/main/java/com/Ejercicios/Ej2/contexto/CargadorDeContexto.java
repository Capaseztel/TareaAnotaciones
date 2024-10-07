package com.Ejercicios.Ej2.contexto;

import com.Ejercicios.Ej2.annotation.Directivo;
import com.Ejercicios.Ej2.annotation.Oficial;
import com.Ejercicios.Ej2.annotation.Tecnico;
import com.Ejercicios.Ej2.Empresa;
import com.Ejercicios.Ej2.empleados.Empleado;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CargadorDeContexto {


    public static List<Tecnico> GetTecnicos() {
        return Arrays.asList(Empresa.class.getAnnotationsByType(Tecnico.class));
    }

    public static List<Oficial> GetOficiales() {
        return Arrays.asList(Empresa.class.getAnnotationsByType(Oficial.class));
    }

    public static List<Directivo> GetDirectivos() {
        return Arrays.asList(Empresa.class.getAnnotationsByType(Directivo.class));
    }

    public List<com.Ejercicios.Ej2.empleados.Directivo> listaDeDirectivos() {
        List<com.Ejercicios.Ej2.empleados.Directivo> listaDirectivo = new ArrayList<>();

        for (Directivo directivoAnnotation : GetDirectivos()) {
            com.Ejercicios.Ej2.empleados.Directivo directivo = new com.Ejercicios.Ej2.empleados.Directivo();
            directivo.setNombre(directivoAnnotation.nombre());
            directivo.setApellidos(directivoAnnotation.apellidos());
            directivo.setDireccion(directivoAnnotation.direccion());
            directivo.setDni(directivoAnnotation.dni());
            directivo.setCodDespacho(directivoAnnotation.codDespacho());
            listaDirectivo.add(directivo);
        }
        return listaDirectivo;
    }

    public List<com.Ejercicios.Ej2.empleados.Tecnico> listaDeTecnicos() {
        List<com.Ejercicios.Ej2.empleados.Tecnico> listaTecnico = new ArrayList<>();

        for (Tecnico tecnico : GetTecnicos()) {
            com.Ejercicios.Ej2.empleados.Tecnico tecnico2 = new com.Ejercicios.Ej2.empleados.Tecnico();
            tecnico2.setNombre(tecnico.nombre());
            tecnico2.setApellidos(tecnico.apellidos());
            tecnico2.setPerfil(tecnico.perfil());
            tecnico2.setDni(tecnico.dni());
            tecnico2.setDireccion(tecnico.direccion());
            tecnico2.setTelefono(tecnico.telefono());
            listaTecnico.add(tecnico2);
        }
        return listaTecnico;
    }

    public List<com.Ejercicios.Ej2.empleados.Oficial> listaDeOficiales() {

        List<com.Ejercicios.Ej2.empleados.Oficial> listaOficial = new ArrayList<>();
        for (Oficial oficialAnnotation : GetOficiales()) {
            com.Ejercicios.Ej2.empleados.Oficial oficial = new com.Ejercicios.Ej2.empleados.Oficial();
            oficial.setNombre(oficialAnnotation.nombre());
            oficial.setApellidos(oficialAnnotation.apellidos());
            oficial.setDireccion(oficialAnnotation.direccion());
            oficial.setDni(oficialAnnotation.dni());
            oficial.setCategoria(oficialAnnotation.categoria());
            oficial.setTelefono(oficialAnnotation.telefono());
            listaOficial.add(oficial);
        }
        return listaOficial;
    }

    public List<Empleado> cargarEmpresa() {
        List<Empleado> empleados = new ArrayList<>();
        empleados.addAll(listaDeDirectivos());
        empleados.addAll(listaDeOficiales());
        empleados.addAll(listaDeTecnicos());
        return empleados;
    }
}