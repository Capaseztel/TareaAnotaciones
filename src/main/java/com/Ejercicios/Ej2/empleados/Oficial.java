package com.Ejercicios.Ej2.empleados;

public class Oficial extends Operario {
    public String categoria;

    public String getCategoria() {
        return categoria;
    }

    public Oficial setCategoria(String categoria) {
        this.categoria = categoria;
        return this;
    }

    @Override
    public String toString() {
        return "\nOficial{ categoria= '" + categoria + "'" + " }" + super.toString();
    }
}
