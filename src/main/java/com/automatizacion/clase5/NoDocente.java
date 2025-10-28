package com.automatizacion.clase5;

public class NoDocente extends  Persona{
    public NoDocente(String nombre, String apellido) {
        super(nombre, apellido);
    }
    @Override
    public void saludar(){
        System.out.println("Hola soy un No Docente");
    }
}
