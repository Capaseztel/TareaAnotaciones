package com.Ejercicios.Ej3;

import com.Ejercicios.Ej3.contexto.CargadorDeContexto;
import com.Ejercicios.Ej3.model.AgendaSemana;

public class Main {
    public static void main(String[] args) {
        AgendaSemana agenda = new AgendaSemana();
        agenda.setTareas(new CargadorDeContexto().cargarTareas());
        System.out.println(agenda.toString());
    }
}
