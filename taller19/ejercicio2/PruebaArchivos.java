package taller19.ejercicio2;

public class PruebaArchivos {
    public static void main(String[] args) {
        GestorArchivos local = new GestorArchivos(new AlmacenamientoLocal());
        local.guardarArchivo("notas.txt", "Taller 19 completado");
        local.mostrarArchivo("notas.txt");

        GestorArchivos nube = new GestorArchivos(new AlmacenamientoNube());
        nube.guardarArchivo("resumen.txt", "Ejemplo de inversión de dependencias");
        nube.mostrarArchivo("resumen.txt");
    }
}
