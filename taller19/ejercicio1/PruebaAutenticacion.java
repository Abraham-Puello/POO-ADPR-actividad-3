package taller19.ejercicio1;

public class PruebaAutenticacion {
    public static void main(String[] args) {
        GestorAutenticacion local = new GestorAutenticacion(new AutenticacionLocal());
        local.iniciarSesion("estudiante", "1234");
        local.iniciarSesion("estudiante", "clave-incorrecta");

        GestorAutenticacion externo = new GestorAutenticacion(new AutenticacionOAuth());
        externo.iniciarSesion("ana", "token-demo");
    }
}
