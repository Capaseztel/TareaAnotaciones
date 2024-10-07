package com.Ejercicios.Ej4.model;
import lombok.*;

@Data // genera automáticamente getters, setters, toString(), equals(), hashCode(), y un constructor para todos los campos
@NonNull // asegura que un campo o parámetro no sea nulo
@Builder // genera el patrón Builder, permitiendo crear objetos de forma fluida y flexible mediante un método estático builder()
@Value // convierte una clase en inmutable, generando automáticamente todos los campos como private y final
public class Car {
    private String marca;
    private String modelo;
    private String año;
    private String matricula;
    private String dniDueno;

}
