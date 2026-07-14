

package com.llanquihue.turismo.model;
//el metodo extends establece la relacion de herencia con recursoagencia, que esta vinculado con registrable y su contrato

public class GuiaTuristico extends RecursoAgencia {
    private String especialidad;

    public GuiaTuristico(String codigo, String nombre, String especialidad) {
        super(codigo, nombre); //llamanos al parent par los datos comunes
        this.especialidad = especialidad; //atributo especifico de esta clase
    }

    @Override  //se personaliza el mensaje según el tipo de entidad
    public String mostrarResumen() {
        return "[GUÍA] " + nombre + " | Especialidad: " + especialidad;
    }
}