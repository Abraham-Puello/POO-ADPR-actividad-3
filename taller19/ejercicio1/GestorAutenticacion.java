package taller19.ejercicio1;

public class GestorAutenticacion {
    private final ServicioAutenticacion servicio;

    public GestorAutenticacion(ServicioAutenticacion servicio) {
        this.servicio = servicio;
    }

    public void iniciarSesion(String usuario, String clave) {
        if (servicio.autenticar(usuario, clave)) {
            System.out.println("Bienvenido, " + usuario + ".");
        } else {
            System.out.println("No se pudo iniciar sesión.");
        }
    }
}
