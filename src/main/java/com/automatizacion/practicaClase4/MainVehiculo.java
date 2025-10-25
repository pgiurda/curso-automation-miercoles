package com.automatizacion.practicaClase4;

public class MainVehiculo {
    public static void main(String[] args) {

        Vehiculo vehiculo1 = new Vehiculo("Peugeot", "208", 2024);
        Vehiculo vehiculo2 = new Vehiculo("Fiat", "Cronos", 2020);

        System.out.println("Marca del vehiculo: " + vehiculo1.getMarca());
        System.out.println("Modelo del vehiculo: " + vehiculo1.getModelo());
        System.out.println("Año del vehiculo: " + vehiculo1.getAnio());

        System.out.println("Marca del vehiculo: " + vehiculo2.getMarca());
        System.out.println("Modelo del vehiculo: " + vehiculo2.getModelo());
        System.out.println("Año del vehiculo: " + vehiculo2.getAnio());
    }
}
