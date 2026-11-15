package taller18.ejercicio3;

public class PruebaVehiculos {
    public static void main(String[] args) {
        Automovil automovil = new Automovil();
        Camion camion = new Camion();

        automovil.conducir();
        camion.conducir();
        camion.cargarMercancia();
    }
}
