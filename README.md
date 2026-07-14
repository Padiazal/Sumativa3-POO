Llanquihue Tour App - Sumativa Semana 8
¡Hola! Este es mi proyecto para la Semana 8 de Programación Orientada a Objetos. El sistema está diseñado para la agencia Llanquihue Tour de la Región de Los Lagos, y sirve para gestionar de forma más ordenada a sus guías, vehículos y colaboradores externos.
¿Qué hace este sistema?
El programa permite registrar distintos tipos de recursos de la agencia a través de una interfaz visual sencilla. Todo se guarda en una colección dinámica y se puede ver un resumen de todos los registros con mensajes personalizados según el tipo de entidad que se haya ingresado.
Estructura del Proyecto
El código está organizado en paquetes para que sea modular y fácil de mantener, siguiendo las buenas prácticas de organización:
com.llanquihue.turismo.model: Contiene las entidades base. Aquí definí la interfaz Registrable, la superclase abstracta RecursoAgencia y las subclases específicas GuiaTuristico, Vehiculo y ColaboradorExterno.
com.llanquihue.turismo.data: Incluye la clase GestorEntidades, que actúa como el motor del sistema al manejar la lista de tipo ArrayList donde se almacena toda la información.
com.llanquihue.turismo.ui: Contiene la clase Main, que es el punto de entrada y se encarga de mostrar la interfaz gráfica al usuario.
com.llanquihue.turismo.util: Contiene la clase Separador, una herramienta de apoyo para que los textos que se muestran por consola aparezcan con títulos bien ordenados.
Conceptos de POO Aplicados
En este trabajo integré los pilares fundamentales aprendidos durante el curso:
Interfaces: Utilicé Registrable como un contrato de comportamiento para que todas las clases implementen el método mostrarResumen().
Herencia: Las clases hijas extienden de RecursoAgencia para reutilizar los atributos de código y nombre, evitando repetir código innecesario.
Polimorfismo e Instanceof: El gestor recorre una lista genérica y usa el operador instanceof para identificar qué es cada objeto en tiempo de ejecución, permitiendo aplicar recordatorios específicos para guías o vehículos.
GUI (Interfaz Gráfica): Implementé el uso de JOptionPane para que el ingreso de datos y la visualización del listado se realicen mediante ventanas emergentes.
Cómo ejecutarlo
Abre el proyecto en IntelliJ IDEA.
Dirígete a la clase Main dentro del paquete ui.
Ejecuta el programa.
Se abrirá un menú con opciones para registrar los diferentes recursos o mostrar el listado completo de la agencia.
Proyecto desarrollado para la asignatura de Programación Orientada a Objetos I.
