package taller18.ejercicio2;

public class PruebaBanco {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria(500);
        CajeroAutomatico cajero = new CajeroAutomatico();

        cuenta.transferir(100);
        cuenta.retirar(50);
        cuenta.pagarFactura(200);
        System.out.println("Saldo restante: $" + cuenta.getSaldo());
        cajero.retirar(40);
    }
}
