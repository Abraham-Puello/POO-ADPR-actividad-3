package taller19.ejercicio1;

public class AutenticacionLocal implements ServicioAutenticacion {
    @Override
    public boolean autenticar(String usuario, String clave) {
        // Datos de ejemplo para practicar, no para una aplicación real.
        return "estudiante".equals(usuario) && "1234".equals(clave);
    }
}
