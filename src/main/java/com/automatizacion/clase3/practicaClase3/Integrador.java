package com.automatizacion.clase3.practicaClase3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Integrador {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numero;
        List<Integer> listaNumeros = new ArrayList<>();
        do {
            System.out.println("Ingrese un numero");
            numero = scanner.nextInt();
            listaNumeros.add(numero);
        } while(numero <= 500);
        System.out.println("Datos ingresados: " + listaNumeros);
        if (listaNumeros.size() < 10){
            System.out.println("Se ingresaron pocos numeros");
        } else {
            System.out.println("Se excedio la cantidad de ingresos");
        }
    }
}
