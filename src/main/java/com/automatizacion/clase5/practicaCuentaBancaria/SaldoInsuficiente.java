package com.automatizacion.clase5.practicaCuentaBancaria;

public class SaldoInsuficiente extends RuntimeException{

    public SaldoInsuficiente(String message) {
        super(message);
    }
    public SaldoInsuficiente() {
        super("Error: Saldo Insuficiente");
    }
}
