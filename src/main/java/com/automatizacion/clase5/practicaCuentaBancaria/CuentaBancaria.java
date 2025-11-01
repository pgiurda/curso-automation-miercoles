package com.automatizacion.clase5.practicaCuentaBancaria;

public class CuentaBancaria {
    private int saldo;

    public CuentaBancaria(int saldo) {
        this.saldo = saldo;
    }

    public int getSaldo() {
        return saldo;
    }

    public void transferir(int monto){
        if (monto > saldo){
            throw new SaldoInsuficiente();
        }
        System.out.println("Realizando la transferencia");
    }
    public boolean tieneSaldo(){
        return  saldo > 0;
    }
}
