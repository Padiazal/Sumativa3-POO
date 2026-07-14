package com.llanquihue.turismo.model;

/**
 Aquí definimos el metodo mostrarResumen sin implementación
 asi se obliga a que cualquier entidad  de la agencia deba saber cómo presentarse (contrato / firma)
 **/
public interface Registrable {
    String mostrarResumen();//declaracion sin implementacion, el metodo mostrarresumen
    // sera personalizado por override de las clases de entidades de la empresa (vehiculo, colaborador, etc)
}