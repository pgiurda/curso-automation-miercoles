package com.automatizacion;

import com.automatizacion.clase5.EjercicioClase5.Espadachin;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestPersonajes {

    @Test
    public void verificarFuerza() {
        Espadachin espadachin2 = new Espadachin("Portos", 80, 50);
        espadachin2.entrenar();
        Assert.assertEquals(espadachin2.getFuerza(),60, "La Fuerza deberia aumentar en 10");
    }
    @Test
    public void verificarDescanso(){
        Espadachin espadachin3 =new Espadachin("Aramis", 20, 70);
        espadachin3.descansar();
        Assert.assertEquals(espadachin3.getSalud(), 35,"Debe aumentar salud en 15");

    }
    @Test
    public void verificarEstaMuerto(){
        Espadachin espadachin4 = new Espadachin("Athos", 30, 60);
        espadachin4.setSalud(-20);
        Assert.assertTrue(espadachin4.estaMuerto(),"El personaje sigue vivo");
    }
    @Test
    public void verificarEstaVivo(){
        Espadachin espadachin5 = new Espadachin("D'Artagnan",30,60);
        espadachin5.setSalud(10);
        Assert.assertFalse(espadachin5.estaMuerto(),"El personaje esta muerto");
    }

}