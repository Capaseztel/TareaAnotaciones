package com.Ejercicios.Ej2.empleados;

public class Tecnico extends Operario {
    public String perfil;

    public String getPerfil() {
        return perfil;
    }

    public Tecnico setPerfil(String perfil) {
        this.perfil = perfil;
        return this;
    }

    @Override
    public String toString() {
        return "\nTecnico{ perfil= '" + perfil + "'" + " }" + super.toString();
    }
}
