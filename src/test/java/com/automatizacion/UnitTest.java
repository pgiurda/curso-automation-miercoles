package com.automatizacion;

import com.automatizacion.clase5.practicaCuentaBancaria.CuentaBancaria;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UnitTest {
    @Test
    public void testSaldo(){
        CuentaBancaria cuenta = new CuentaBancaria(10);

        Assert.assertTrue(cuenta.tieneSaldo(), "La cuenta no tiene saldo");
    }
    @Test
    public void testSinSaldo(){
        CuentaBancaria cuenta = new CuentaBancaria(0);

        Assert.assertFalse(cuenta.tieneSaldo(), "La cuenta tiene saldo");
    }
}
