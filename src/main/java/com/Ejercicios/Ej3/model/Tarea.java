package com.Ejercicios.Ej3.model;

public class Tarea {
    private String tituloTarea;
    private String descripcion;
    private String diaDeLaSemana;
    private String hora;

    public String getTituloTarea() {
        return tituloTarea;
    }

    public void setTituloTarea(String tituloTarea) {
        this.tituloTarea = tituloTarea;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDiaDeLaSemana() {
        return diaDeLaSemana;
    }

    public void setDiaDeLaSemana(String diaDeLaSemana) {
        this.diaDeLaSemana = diaDeLaSemana;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    @Override
    public String toString() {
        return "\nTarea{" +
                "tituloTarea='" + tituloTarea +
                ", descripcion='" + descripcion +
                ", diaDeLaSemana='" + diaDeLaSemana +
                ", hora='" + hora + "}\n";
    }
}
