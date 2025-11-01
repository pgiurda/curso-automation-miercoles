package com.automatizacion.clase5.practicaClase5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Reader {
    private String path;

    public Reader(String path) {
        this.path = path;
    }

    public String read() throws IOException {
        var texto = Files.readString(Path.of(path));
        return texto;
    }
}
