package taller19.ejercicio2;

public class GestorArchivos {
    private final Almacenamiento almacenamiento;

    public GestorArchivos(Almacenamiento almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public void guardarArchivo(String nombre, String contenido) {
        almacenamiento.guardar(nombre, contenido);
    }

    public void mostrarArchivo(String nombre) {
        String contenido = almacenamiento.recuperar(nombre);
        if (contenido == null) {
            System.out.println("No se encontró el archivo: " + nombre);
        } else {
            System.out.println("Contenido de " + nombre + ": " + contenido);
        }
    }
}
