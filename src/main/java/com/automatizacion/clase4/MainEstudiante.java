package com.automatizacion.clase4;

public class MainEstudiante {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante();
        Estudiante estudiante2 = new Estudiante(20, "Pablo Giurda", 8.6f);

        System.out.println("Datos del estudiante (vacio): " + estudiante);
        System.out.println("Nombre del estudiante: " + estudiante.getNombreCompleto());
        System.out.println("ID del estudiante: " + estudiante.getId());
        System.out.println("Promedio del estudiante: " + estudiante.getPromedio());

        System.out.println("Datos del estudiante (vacio): " + estudiante2);
        System.out.println("Nombre del estudiante: " + estudiante2.getNombreCompleto());
        System.out.println("ID del estudiante: " + estudiante2.getId());
        System.out.println("Promedio del estudiante: " + estudiante2.getPromedio());

        estudiante2.setPromedio(9.6f);
        System.out.println(estudiante2.getPromedio());

    }
}
