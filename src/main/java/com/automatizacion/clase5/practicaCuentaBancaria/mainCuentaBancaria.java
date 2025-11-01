package com.automatizacion.clase5.practicaCuentaBancaria;

public class mainCuentaBancaria {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria(50);

        try{
        cuenta.transferir(60);
        }catch (SaldoInsuficiente e){
            var saldo = cuenta.getSaldo();
            cuenta.transferir(saldo);
        }
    }
}
