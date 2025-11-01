package com.automatizacion.clase5;

public class NoDocente extends  Persona{
    public NoDocente(String nombre, String apellido) {
        super(nombre, apellido);
    }
    @Override
    public void saludar(){
        System.out.println("Hola soy un No Docente");
    }

    abstract static class Figura {

        private String color;

        public Figura(String color) {
            this.color = color;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }
        abstract public double calcularArea();
    }
}
