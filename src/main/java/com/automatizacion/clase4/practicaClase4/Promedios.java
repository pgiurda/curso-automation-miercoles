package com.automatizacion.clase4.practicaClase4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Promedios {
    public static void main(String[] args) {

        /*
        Ejercicio 1 - Promedio de notas
Se requiere cargar las 10 notas de un alumno para calcular el promedio.
Es necesario cargar las notas usando la consola y al finalizar mostrar en pantalla el
promedio de todas las notas.
Tip: usar la clase Scanner para el ingreso por consola, y el bucle for para iterar.
Tip: usar una lista para almacenar las notas.
         */
        Scanner sc = new Scanner(System.in);
        List<Integer> listaNumeros = new ArrayList<>();

        while (listaNumeros.size()<10){
            System.out.println("Ingrese un numero:");
            listaNumeros.add(sc.nextInt());
        };

        System.out.println(listaNumeros);
        int acumulador = 0;
        for(int numero : listaNumeros){
            acumulador = acumulador + numero;
        }
        double promedio = acumulador / listaNumeros.size();
        System.out.println("El promedio es: " + promedio);
    }
}
