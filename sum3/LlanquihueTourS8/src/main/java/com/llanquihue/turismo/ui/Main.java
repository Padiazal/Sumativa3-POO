package com.llanquihue.turismo.ui;

//importa lo necesario para que funcione ok trayendo elementos de los paquetes creados, ademas habilita swing para la GUI
import com.llanquihue.turismo.data.GestorEntidades;
import com.llanquihue.turismo.model.*;
import com.llanquihue.turismo.util.Separador;
import javax.swing.JOptionPane;  //clase de gui

public class Main {
    //Se crea el admin que gestiona las entiddades que forman la info que la empresa necesita
    public static void main(String[] args) {
        GestorEntidades gestor = new GestorEntidades();
        boolean salir = false; //el meunu se verá a menos que pongamos salir

        //condicional while que incluye la creacion del contenido de la GUI y lo muestra sujeto a ciertas condiciones
        while (!salir) {
            String menu = "--- Llanquihue Tour: Gestión Administrativa ---\n" +
                    "1. Registrar Guía Turístico\n" +
                    "2. Registrar Vehículo\n" +
                    "3. Registrar Colaborador Externo\n" + // Nueva opción visual
                    "4. Mostrar Todos los Registros\n" +
                    "5. Salir";

            String op = JOptionPane.showInputDialog(menu); //abre GUI que permite ingreso de datos

            //se establecen al condiciones de cierre: que se ingrese 5, cancelar o se presion X
            if (op == null || op.equals("5")) {
                salir = true;
            } else {
                procesarOpcion(op, gestor);
            }
        }
    }

    //procesador de opciones que incluye un selector de casos (switch) dentro de un try catch que detecta fallos en la logica y detiene el proceso
    private static void procesarOpcion(String op, GestorEntidades gestor) {
        try {
            switch (op) {
                case "1"://agrega guia
                    String c1 = JOptionPane.showInputDialog("Código:");
                    String n1 = JOptionPane.showInputDialog("Nombre:");
                    String e1 = JOptionPane.showInputDialog("Especialidad:");
                    gestor.agregar(new GuiaTuristico(c1, n1, e1));
                    JOptionPane.showMessageDialog(null, "Guía guardado.");
                    break;

                case "2"://agrega vehiculo
                    String c2 = JOptionPane.showInputDialog("Código:");
                    String n2 = JOptionPane.showInputDialog("Modelo:");
                    String p2 = JOptionPane.showInputDialog("Patente:");
                    gestor.agregar(new Vehiculo(c2, n2, p2));
                    JOptionPane.showMessageDialog(null, "Vehículo guardado.");
                    break;

                case "3": // agrega externo
                    String c3 = JOptionPane.showInputDialog("Código Colaborador:");
                    String n3 = JOptionPane.showInputDialog("Nombre de Contacto:");
                    String e3 = JOptionPane.showInputDialog("Empresa Prestadora:");
                    gestor.agregar(new ColaboradorExterno(c3, n3, e3));
                    JOptionPane.showMessageDialog(null, "Colaborador Externo guardado.");
                    break;

                case "4": // Mostrar, gestor de gestor entidades accede al array, muestra lo necesario de acuerdo a la opcion (polimorfismo dinamico)

                    String listado = gestor.obtenerListado();

                    // Crea  GUI
                    JOptionPane.showMessageDialog(null, listado);

                    // usa el separador de UTIL para resumir codigo,y muestra lo definido en  "listado" (obtener el listado)
                    Separador.titulo("LOG DE CONSULTA GUI");
                    System.out.println(listado);// Se imprime la info por consola
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida."); //caso por defecto en switch, si no se ingresa el numero correcto, avisa
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en el ingreso de datos.");
            // ^catch que complementa con manejo de exepciones si se ingresan datos incorrectos
        }
    }
}