package com.llanquihue.turismo.model;

public class Vehiculo extends RecursoAgencia {
    private String patente;

    public Vehiculo(String codigo, String modelo, String patente) {
        super(codigo, modelo);
        this.patente = patente;
    }

    @Override
    public String mostrarResumen() {
        return "[VEHÍCULO] " + nombre + " | Patente: " + patente;
    }
}