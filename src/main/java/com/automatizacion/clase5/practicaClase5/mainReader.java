package com.automatizacion.clase5.practicaClase5;

import java.io.IOException;

public class mainReader {
    public static void main(String[] args) throws IOException {
        Reader reader = new Reader("texto,txt");

        String textoLeido;
        textoLeido = reader.read();
    }
}
