package com.automatizacion.clase5.EjercicioClase5;

public class Torre extends Personaje {
    private int nivel;

    public int getPoder() {
        return nivel;
    }

    public void setPoder(int poder) {
        this.nivel = nivel;
    }

    public Torre(String nombre, int salud, int nivel) {
        super(nombre, salud);
        this.nivel = nivel;
    }
    @Override
    public void entrenar(){
        nivel = nivel + 1;
    }
    @Override
    void descansar(){};

    @Override
    boolean estaMuerto() {
        return super.estaMuerto();
    }
}
