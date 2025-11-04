package com.automatizacion.clase6.practicaClase6;

public class SaludInvalida extends RuntimeException {
    public SaludInvalida(String message) {
        super(message);
    }
    public SaludInvalida() {
        super("No puede nacer muerto");
    }
}
