package Pilas;
/**
 * Excepción que usa la pila cuando está vacía y se intenta hacer
 */
public class ExcepcionColeccionVacia extends RuntimeException{

    public ExcepcionColeccionVacia() {
    }
    public ExcepcionColeccionVacia(String mensaje) {
        super(mensaje);
    }
    
}
