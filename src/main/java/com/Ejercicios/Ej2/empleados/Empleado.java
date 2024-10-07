package com.Ejercicios.Ej2.empleados;


import java.util.Objects;

public class Empleado {

    private String nombre;
    private String apellidos;
    private String direccion;
    private String dni;
    private int telefono;


    public Empleado() {
    }

    public String getApellidos() {
        return apellidos;
    }

    public Empleado setApellidos(String apellidos) {
        this.apellidos = apellidos;
        return this;
    }

    public String getDireccion() {
        return direccion;
    }

    public Empleado setDireccion(String direccion) {
        this.direccion = direccion;
        return this;
    }

    public String getDni() {
        return dni;
    }

    public Empleado setDni(String dni) {
        this.dni = dni;
        return this;
    }

    public String getNombre() {
        return nombre;
    }

    public Empleado setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public int getTelefono() {
        return telefono;
    }

    public Empleado setTelefono(int telefono) {
        this.telefono = telefono;
        return this;
    }

    @Override
    public String toString() {
        return "\n{Empleado:" +
                "\napellidos='" + apellidos + "'" +
                "\nnombre='" + nombre + "'" +
                "\ndireccion='" + direccion + "'" +
                "\ndni='" + dni + "'" +
                "\ntelefono=" + telefono + "}\n";
    }
}
