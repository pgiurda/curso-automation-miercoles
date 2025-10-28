package com.automatizacion.clase4.practicaClase4;

import java.util.ArrayList;
import java.util.List;

public class MainCurso {
    public static void main(String[] args) {

        Curso curso1 = new Curso("Diplomatura de testing de software", 10);
        Curso curso2 = new Curso("Secretariado informatico", 8);
        Curso curso3 = new Curso("Tecnico en Refrigeracion", 12);

        System.out.println("El curso " + curso1.getNombre() + "tiene una duracion de " + curso1.getDuracion() + " meses de cursado");
        System.out.println("El curso " + curso2.getNombre() + "tiene una duracion de " + curso2.getDuracion() + " meses de cursado");
        System.out.println("El curso " + curso3.getNombre() + "tiene una duracion de " + curso3.getDuracion() + " meses de cursado");

        List<Curso> cursos = new ArrayList<>();
        cursos.add(curso1);
        cursos.add(curso2);
        cursos.add(curso3);

        System.out.println();
        for (int i = 0; i < cursos.size(); i++){
            System.out.println(cursos.get(i));
        }

    }
}
