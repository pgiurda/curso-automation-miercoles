package com.automatizacion.clase3.practicaClase3;

public class Notas {
    public static void main(String[] args) {
        int nota = 8;

        if (nota >= 1 && nota <= 3) {
            System.out.println("La nota es insuficiente");
        } else if (nota >= 4 && nota <= 5) {
            System.out.println("La nota es regular");
        } else if (nota >= 6 && nota <= 7) {
            System.out.println("La nota es regular");
        } else if (nota >= 8 && nota <= 9) {
            System.out.println("La nota es Muy Bueno");
        } else if (nota == 10 ) {
            System.out.println("La nota es Excelente");
        } else System.out.println("Error al cargar la nota");
    }
}