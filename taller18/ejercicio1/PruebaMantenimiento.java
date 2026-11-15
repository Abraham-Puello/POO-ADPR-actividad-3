package taller18.ejercicio1;

public class PruebaMantenimiento {
    public static void main(String[] args) {
        Tecnico tecnico = new Tecnico();
        AuxiliarLimpieza auxiliar = new AuxiliarLimpieza();

        tecnico.reparar();
        auxiliar.limpiar();
    }
}
