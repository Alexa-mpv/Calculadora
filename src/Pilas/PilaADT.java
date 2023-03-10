package Pilas;
/**
 * Interface con la funcionalidad que debe tener una pila
 */
public interface PilaADT <T> {
    
    public void push(T dato);
    public T pop();
    public T peek();
    public boolean isEmpty();
    public void multiPop(int n);
    
}
