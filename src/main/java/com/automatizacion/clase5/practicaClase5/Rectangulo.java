package com.automatizacion.clase5.practicaClase5;

public class Rectangulo extends Figura implements Dibujable{
    private int base;
    private int altura;


    public Rectangulo(String color, int base, int altura) {
        super(color);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }

    @Override
    public void Dibujar() {
        System.out.println("Se dibuja un rectangulo de color: " + getColor());
    }
}
