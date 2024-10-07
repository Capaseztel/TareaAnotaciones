package com.Ejercicios.Ej2;

import com.Ejercicios.Ej2.contexto.CargadorDeContexto;

public class Main {
    public static void main(String[] args) {

        Empresa empresa = new Empresa().setNombre("Empresa2").setEmpleados(new CargadorDeContexto().cargarEmpresa());

        System.out.println(empresa);
    }
}
