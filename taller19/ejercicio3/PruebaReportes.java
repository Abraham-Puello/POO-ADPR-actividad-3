package taller19.ejercicio3;

public class PruebaReportes {
    public static void main(String[] args) {
        GestorReportes pdf = new GestorReportes(new ReportePDF());
        pdf.crearReporte("Ventas", "Total vendido: $500");

        GestorReportes excel = new GestorReportes(new ReporteExcel());
        excel.crearReporte("Inventario", "Productos disponibles: 20");
    }
}
