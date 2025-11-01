package com.automatizacion.clase5.practicaCuentaBancaria;

public class SaldoInsuficiente extends RuntimeException{
    public SaldoInsuficiente(String message) {
        super(message);
    }
    public SaldoInsuficiente() {
        System.out.println("Error: Saldo Insuficiente");
    }
}
