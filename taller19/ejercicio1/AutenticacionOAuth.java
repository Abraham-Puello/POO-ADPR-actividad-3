package taller19.ejercicio1;

public class AutenticacionOAuth implements ServicioAutenticacion {
    @Override
    public boolean autenticar(String usuario, String clave) {
        // Simulamos la validación de un proveedor externo.
        return usuario != null && !usuario.isBlank() && "token-demo".equals(clave);
    }
}
