package com.automatizacion.clase5.EjercicioClase5;

public class MainPersonajes {
    public static void main(String[] args) {
        Espadachin espadachin = new Espadachin("Carlos", 100, 60);
        Mago mago = new Mago("Riado", 90, 150, "Encantamiento");
        Mago mago2 = new Mago("Steado", 95, 200, "Malefico");
        Torre torre = new Torre("Oscura", 150, 60);

        espadachin.entrenar();
        espadachin.descansar();
        mago.entrenar();
        mago2.entrenar();
        mago.atacar(torre);
        System.out.println("El espadachin esta entrenando y su fuerza aumenta en " + espadachin.getFuerza() + " y tambien descansa por lo que su salud aumenta a " + espadachin.getSalud());
        System.out.println("El mago malefico entrena y aumenta su poder en: " + mago2.getPoder());
        System.out.println("El mago blanco entrena y aumenta su poder en: " + mago.getPoder());
        System.out.println("Espadachin ataca a mago y su salud disminuye a " + torre.getSalud());

    }
}
