package com.Ejercicios.Ej1.empleados;

public class Operario extends Empleado {
    private int codTaller;

    public int getCodTaller() {
        return codTaller;
    }

    public Operario setCodTaller(int codTaller) {
        this.codTaller = codTaller;
        return this;
    }

    @Override
    public String toString() {
        return "\nOperario{ codTaller= " + codTaller + " }" + super.toString();
    }
}