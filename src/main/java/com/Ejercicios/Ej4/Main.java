package com.Ejercicios.Ej4;

import com.Ejercicios.Ej4.model.Car;

public class Main {
    public static void main(String[] args) {

        Car carBuilder = Car.builder().marca("Mazda").modelo("Mx5").año("2005").matricula("7777ESP").dniDueno("11111111A").build();

        System.out.println("Coche: " + carBuilder);
    }
}
