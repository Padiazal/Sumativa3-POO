package com.llanquihue.turismo.model;
/**Supeclase, clase abstracta  que contiene codigo y nombre, es tipo protected para que lops child la puedan acceder,
 *  es aqui que se llama o implementa la interfaz "registrable" estableciendo el contrato (reglas que debe cumplir) , las subclases (guias, vehiculos, personas, etc)
 *  usan extendes y llaman a este parent mediante super para disponer de la var codigo y nombre
 *  cada child contendra  aparte las variables unicas que justifican su existencia al evitar la duplicidad
 *  */
public abstract class RecursoAgencia implements Registrable {
    protected String codigo;
    protected String nombre;

    //constructor
    public RecursoAgencia(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }
//getter
    public String getCodigo() { return codigo; }
    public String getNombre() { return nombre; }
}