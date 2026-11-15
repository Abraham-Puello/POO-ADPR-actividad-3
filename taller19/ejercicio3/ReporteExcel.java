package taller19.ejercicio3;

public class ReporteExcel implements GeneradorReporte {
    @Override
    public void generarReporte(String titulo, String contenido) {
        System.out.println("Generando reporte Excel (simulación): " + titulo);
        System.out.println("Contenido: " + contenido);
    }
}
