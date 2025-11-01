package com.automatizacion.clase5.EjercicioClase5;

public class Espadachin extends Personaje implements Ofensivo {
    private int fuerza;

    public Espadachin(String nombre, int salud, int fuerza) {
        super(nombre, salud);
        this.fuerza = fuerza;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    @Override
    public void entrenar() {
        fuerza = fuerza + 10;
    }

    @Override
    public void atacar(Personaje unPersonaje) {
        int danio = fuerza * 2;
        unPersonaje.recibirDanio(danio);
    }
  }
