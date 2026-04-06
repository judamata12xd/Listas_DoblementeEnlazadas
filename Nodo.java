public class Nodo {

    private int dato;
    private Nodo Siguiente;
    private Nodo Anterior;

    public Nodo() {
    }

    public Nodo(int dato, Nodo siguiente, Nodo anterior) {
        this.dato = dato;
        Siguiente = siguiente;
        Anterior = anterior;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public Nodo getSiguiente() {
        return Siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        Siguiente = siguiente;
    }

    public Nodo getAnterior() {
        return Anterior;
    }

    public void setAnterior(Nodo anterior) {
        Anterior = anterior;
    }    
}
