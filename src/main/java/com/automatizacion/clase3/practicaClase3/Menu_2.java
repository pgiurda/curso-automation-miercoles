package com.automatizacion.clase3.practicaClase3;

import java.util.HashMap;

public class Menu_2 {
    public static void main(String[] args) {

        int eleccionMenu = 3;

        HashMap<Integer, String>  listaMenu = new HashMap<>();
        listaMenu.put(1, "Hamburguesas con papas fritas");
        listaMenu.put(2, "Guiso de lentejas");
        listaMenu.put(3, "24 piezas de sushi variadas");
        listaMenu.put(4, "Pizza de jamon y morron");
        listaMenu.put(5, "Empanadas de carne");

        switch (eleccionMenu) {
            case 1:
                System.out.println("Ha elegido " + listaMenu.get(1));
                break;
            case 2:
                System.out.println("Ha elegido " + listaMenu.get(2));
                break;
            case 3:
                System.out.println("Ha elegido " + listaMenu.get(3));
                break;
            case 4:
                System.out.println("Ha elegido " + listaMenu.get(4));
                break;
            case 5:
                System.out.println("Ha elegido " + listaMenu.get(5));
                break;
        }
    }
}