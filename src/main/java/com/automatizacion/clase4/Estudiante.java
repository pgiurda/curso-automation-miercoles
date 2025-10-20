package com.automatizacion.clase4;

public class Estudiante {
    private int id;
    private String nombreCompleto;
    private float promedio;

    public Estudiante () {
        this.id = 0;
        this.nombreCompleto = "";
        this.promedio = 5;
    }

    public Estudiante(int id, String nombreCompleto, float promedio){
        this.id = id;
        this.nombreCompleto = nombreCompleto;
        this.promedio = promedio;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public float getPromedio() {
        return promedio;
    }

    public void setPromedio(float promedio) {
        this.promedio = promedio;
    }
}
