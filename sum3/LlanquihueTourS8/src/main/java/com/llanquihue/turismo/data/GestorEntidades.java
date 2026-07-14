package com.llanquihue.turismo.data;
//data: logica y datos, administra la info y el almacenamiento
/*importacion de clases requeridad para uso de arrays y lists ademas de lo que entregue model (* implica totalidad)*/
import com.llanquihue.turismo.model.*;
import java.util.ArrayList;
import java.util.List;

public class GestorEntidades {
    //guarda cualquier objeto que cumpla con el contrato "registrable" (apicacion de colecciones genericas)
    private final List<Registrable> lista;
//crea lista
    public GestorEntidades() {
        this.lista = new ArrayList<>();
    }
//metodo para agregar objetos registrables
    public void agregar(Registrable r) {
        lista.add(r);
    }
//condiciona que si no hay regsitros de un mensaje
    public String obtenerListado() {
        if (lista.isEmpty()) return "No hay registros cargados.";
//swe usa stringbuilder para gestion avanzada de texto por partes
        StringBuilder sb = new StringBuilder("=== LISTADO DE LA AGENCIA ===\n");
      //ciclo que se usa para mostrar el resumen, cada elemento de la lista entrega su info
        for (Registrable r : lista) {
            sb.append(r.mostrarResumen());

            // Validación de tipos reales mediante el metodo append habilitado al usar  stringbuilder,
            // condiciona el agregar info especifica a esa categoria si es que s detectada como "recoradatorio"

            if (r instanceof GuiaTuristico) { //Uso de instance of para identificar el tipo real de objeto e incorporar logica diferenciada para los guias
                sb.append(" -> (Validar credencial SERNATUR)");
            } else if (r instanceof Vehiculo) { //Uso de instance of para identificar el tipo real de objeto e incorporar logica diferenciada para los vehiculos
                sb.append(" -> (Revisar revisión técnica)");
            }
            sb.append("\n");
        }
        //se usa metodo tostring fr SB , da el resultado final de texto creado con String B
        return sb.toString();
    }
}