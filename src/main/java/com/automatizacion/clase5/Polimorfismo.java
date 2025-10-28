package com.automatizacion.clase5;

public class Polimorfismo {
    public static void main(String[] args) {
    Alumno alumno = new Alumno("Juan","Peralta","id154",8.66);
    Profesor profesor1 = new Profesor("Cristian","Fernandez","Paleontologia");
    NoDocente limpieza = new NoDocente("Miguel","Juarez");

    imprimir(alumno);
    imprimir(profesor1);
    imprimir(limpieza);
    }

    public static void imprimir(Persona persona){
        persona.saludar();
    }
}
