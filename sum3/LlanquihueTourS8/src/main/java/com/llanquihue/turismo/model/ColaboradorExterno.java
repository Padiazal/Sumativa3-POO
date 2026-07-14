package com.llanquihue.turismo.model;

public class ColaboradorExterno extends RecursoAgencia {
    private String empresa;

    public ColaboradorExterno(String codigo, String nombre, String empresa) {
        super(codigo, nombre);
        this.empresa = empresa;
    }

    @Override
    public String mostrarResumen() {
        return "[EXTERNO] Contacto: " + nombre + " | Empresa: " + empresa;
    }
}