package com.automatizacion.clase3.practicaClase3;

import java.util.ArrayList;

public class listaMaterias {
    public static void main(String[] args) {

        ArrayList<String> materias = new ArrayList<>();

        materias.add("Probabilidad y Estadistica");
        materias.add("FIsica");
        materias.add("Analisis Matematico");
        materias.add("Quimica");

        System.out.println(materias.get(0));
        System.out.println(materias.get(1));
        System.out.println(materias.get(2));
        System.out.println(materias.get(3));

        materias.remove(2);
        System.out.println(materias);
    }
}
