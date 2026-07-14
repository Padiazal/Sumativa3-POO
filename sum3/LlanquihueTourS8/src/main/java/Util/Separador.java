package Util;

public final class Separador {
    private Separador() {} // Constructor privado para evitar instanciación u
    // usando "separador" en vez de tener que escribir las lineas en el resultado final como parte de buenas practicas

    public static void titulo(String texto) {
        System.out.println("\n==============================");
        System.out.println(texto);
        System.out.println("==============================");
    }
}