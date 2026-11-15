package taller19.ejercicio3;

public class ReportePDF implements GeneradorReporte {
    @Override
    public void generarReporte(String titulo, String contenido) {
        System.out.println("Generando reporte PDF (simulación): " + titulo);
        System.out.println("Contenido: " + contenido);
    }
}
