package taller18.ejercicio2;

public class CuentaBancaria implements Transferible, Retirable, PagadorFacturas {
    private double saldo;

    public CuentaBancaria(double saldoInicial) {
        this.saldo = Math.max(0, saldoInicial);
    }

    @Override
    public void transferir(double monto) {
        descontar(monto, "Transferencia");
    }

    @Override
    public void retirar(double monto) {
        descontar(monto, "Retiro");
    }

    @Override
    public void pagarFactura(double monto) {
        descontar(monto, "Pago de factura");
    }

    private void descontar(double monto, String operacion) {
        if (!Double.isFinite(monto) || monto <= 0) {
            System.out.println(operacion + " rechazada: el monto no es válido.");
        } else if (monto > saldo) {
            System.out.println(operacion + " rechazada: saldo insuficiente.");
        } else {
            saldo -= monto;
            System.out.println(operacion + " realizada por $" + monto);
        }
    }

    public double getSaldo() {
        return saldo;
    }
}
