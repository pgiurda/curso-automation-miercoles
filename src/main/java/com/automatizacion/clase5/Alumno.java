package com.automatizacion.clase5;

public class Alumno extends Persona{
    private String legajo;
    private double promedio;

    public Alumno(String nombre, String apellido,String legajo, double promedio) {
        super(nombre, apellido);
        this.legajo = legajo;
        this.promedio = promedio;
    }

    public String getLegajo() {
        return legajo;
    }

    public void setLegajo(String legajo) {
        this.legajo = legajo;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }
    @Override
    public void saludar(){
        System.out.println("Hola soy un alumno");
    }
}
