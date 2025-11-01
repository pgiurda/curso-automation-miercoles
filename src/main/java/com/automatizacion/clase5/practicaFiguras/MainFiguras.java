package com.automatizacion.clase5.practicaFiguras;

import java.util.ArrayList;
import java.util.List;

public class MainFiguras {
    public static void main(String[] args) {

        Cuadrado cuadrado = new Cuadrado("rojo", 30);
        Rectangulo rectangulo = new Rectangulo("azul", 10, 20);
        Triangulo triangulo = new Triangulo("verde", 10, 15);

        List<Figura> figuras = new ArrayList<>();

        figuras.add(cuadrado);
        figuras.add(rectangulo);
        figuras.add(triangulo);

        for (Figura figura : figuras){
            System.out.println("Area de la figura: " + figura.calcularArea());
        }
        List<Dibujable> dibujables = new ArrayList<>();
        dibujables.add(cuadrado);
        dibujables.add(rectangulo);
    }
}
