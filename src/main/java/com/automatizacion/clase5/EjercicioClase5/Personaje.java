package com.automatizacion.clase5.EjercicioClase5;

abstract class Personaje {
    private String nombre;
    private int salud;

    public Personaje(String nombre, int salud) {
        this.nombre = nombre;
        this.salud = salud;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }
    public void descansar(){
        salud += 15;
    };
    public boolean estaMuerto(){
        return salud <= 0;
    }
    abstract void entrenar();

    public void recibirDanio(int danio) {
        salud -= danio;
    }
}
