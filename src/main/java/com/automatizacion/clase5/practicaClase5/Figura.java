package com.automatizacion.clase5.practicaClase5;

abstract class Figura {

    private String color;

    public Figura(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    abstract public double calcularArea();
}
