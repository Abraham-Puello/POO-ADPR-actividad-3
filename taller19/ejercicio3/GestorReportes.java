package taller19.ejercicio3;

public class GestorReportes {
    private final GeneradorReporte generador;

    public GestorReportes(GeneradorReporte generador) {
        this.generador = generador;
    }

    public void crearReporte(String titulo, String contenido) {
        generador.generarReporte(titulo, contenido);
    }
}
