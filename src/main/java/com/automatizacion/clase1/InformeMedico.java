package com.automatizacion.clase1;

public class InformeMedico {
    public static void main(String[] args) {
        String paciente = "Juan Perez";
        String fechaDeEstudio = "02/10/2025";
        int edad = 25;
        double altura = 1.75;
        boolean coberturaMedica = true;
        String enfermedadPreexistente = "Diabetes";

        System.out.println("Paciente: " + paciente);
        System.out.println("Fecha de estudio: " + fechaDeEstudio);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Tiene " + altura + " mts de altura");
        System.out.println("Posee cobertura medica activa? " + coberturaMedica);
        System.out.println("Enfermedad preexistente: " + enfermedadPreexistente);
    }
}
