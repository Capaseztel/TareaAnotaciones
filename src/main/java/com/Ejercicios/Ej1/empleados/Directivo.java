package com.Ejercicios.Ej1.empleados;

public class Directivo extends Empleado {
    private int codDespacho;

    public int getCodDespacho() {
        return codDespacho;
    }



    public Directivo setCodDespacho(int codDespacho) {
        this.codDespacho = codDespacho;
        return this;
    }

    @Override
    public String toString() {
        return "\nDirectivo{ codDespacho= " + codDespacho + " }" + super.toString();
    }
}