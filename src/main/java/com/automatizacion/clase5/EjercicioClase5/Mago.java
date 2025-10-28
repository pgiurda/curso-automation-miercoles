package com.automatizacion.clase5.EjercicioClase5;


public class Mago extends Personaje implements  Ofensivo{
    private int poder;
    private String tipoMagia;

    public Mago(String nombre, int salud, int poder, String tipoMagia) {
        super(nombre, salud);
        this.poder = poder;
        this.tipoMagia = tipoMagia;
    }

    @Override
    public void entrenar() {
        switch (tipoMagia){
            case "Encantamiento": poder += 3;
            case "Malefico": poder += 5;}
    }

    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }

    public String getTipoMagia() {
        return tipoMagia;
    }

    public void setTipoMagia(String tipoMagia) {
        this.tipoMagia = tipoMagia;
    }
    @Override
    public void atacar(Personaje unPersonaje) {
        int danio = poder * 5;
        unPersonaje.recibirDanio(danio);
    }
    @Override
    void descansar(){};

    @Override
    boolean estaMuerto() {
        return super.estaMuerto();
    }
}
