package com.automatizacion.practicaClase3;

import java.util.ArrayList;

public class DiaDeLaSemana {
    public static void main(String[] args) {
        ArrayList<String> diasSemana = new ArrayList<>();
        diasSemana.add("Lunes");
        diasSemana.add("Martes");
        diasSemana.add("Miercoles");
        diasSemana.add("Jueves");
        diasSemana.add("Viernes");
        diasSemana.add("Sabado");
        diasSemana.add("Domingo");

        for(int i = 0; i < diasSemana.size(); i++){
            System.out.println("El dia de la semana es " + diasSemana.get(i));
        }
    }
}
