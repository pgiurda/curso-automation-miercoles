package com.automatizacion.clase2;

import java.util.*;


public class Practica1 {
    public static void main(String[] args) {
        //arays
        int [] arrayNumeros = new int[3];

        arrayNumeros[0] = 4;
        arrayNumeros[1] = 6;
        arrayNumeros[2] = 9;

//        System.out.println("El valor en la posicion 0 es: " + arrayNumeros[0]);
//        System.out.println("El valor en la posicion 1 es: " + arrayNumeros[1]);
//        System.out.println("El valor en la posicion 2 es: " + arrayNumeros[2]);
//
//        System.out.println("El valor del array es : " + Arrays.toString(arrayNumeros));

        List<String> arrayNombres = new ArrayList<>();

        arrayNombres.add("Pepe");
        arrayNombres.add("Maria");
        arrayNombres.add("Juan");

        System.out.println("Los elementos del array son: " + arrayNombres);
        System.out.println("El elemento en la posicion 0 es: " + arrayNombres.get(0));
        System.out.println("El elemento en la posicion 1 es: " + arrayNombres.get(1));
        System.out.println("El elemento en la posicion 2 es: " + arrayNombres.get(2));


        arrayNombres.remove(0);
        arrayNombres.remove("Maria");
//        System.out.println("La lista actualizada es: " + arrayNombres);

        Map<String, Integer> nombreyEdades = new HashMap<>();
        nombreyEdades.put("Pepe", 45);
        nombreyEdades.put("Maria", 30);
        nombreyEdades.put("Juan", 60);
        nombreyEdades.put("Carlos", 70);
        System.out.println(nombreyEdades);
        System.out.println("la edad de Maria es " + nombreyEdades.get("Maria"));
    }
}
