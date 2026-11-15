package taller19.ejercicio2;

import java.util.HashMap;
import java.util.Map;

public class AlmacenamientoNube implements Almacenamiento {
    private final Map<String, String> archivos = new HashMap<>();

    @Override
    public void guardar(String nombre, String contenido) {
        archivos.put(nombre, contenido);
        System.out.println("Archivo guardado en la nube (simulación): " + nombre);
    }

    @Override
    public String recuperar(String nombre) {
        return archivos.get(nombre);
    }
}
