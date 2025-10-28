package com.automatizacion.clase5.practicaClase5;

public class Cuadrado extends Figura implements Dibujable{

    private int lado;

    public Cuadrado(String color, int lado) {
        super(color);
        this.lado = lado;
    }
    @Override
    public double calcularArea() {
        return lado * lado;
    }

    @Override
    public void Dibujar() {
        System.out.println("Se dibuja un cuadrado de color: " + getColor());
    }
}
