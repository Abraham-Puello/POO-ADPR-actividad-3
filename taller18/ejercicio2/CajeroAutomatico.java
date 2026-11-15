package taller18.ejercicio2;

public class CajeroAutomatico implements Retirable {
    @Override
    public void retirar(double monto) {
        if (Double.isFinite(monto) && monto > 0) {
            System.out.println("El cajero entrega $" + monto);
        } else {
            System.out.println("El monto del retiro no es válido.");
        }
    }
}
