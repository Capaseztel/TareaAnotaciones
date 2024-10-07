package com.Ejercicios.Ej1;


import com.Ejercicios.Ej1.contexto.CargadorDeContexto;

public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa().setNombre("Empresa1").setEmpleados(new CargadorDeContexto().cargarEmpleados());
        System.out.println(empresa);
    }
}
