package Unidad5_TiposDeListaYListaDeListas;

public class NodoDobleEntero {
    private int dato;
    private NodoDobleEntero siguiente;
    private NodoDobleEntero anterior;

    public NodoDobleEntero(int dato) {
        this.dato = dato;
        this.siguiente = null;
        this.anterior = null;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public NodoDobleEntero getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoDobleEntero siguiente) {
        this.siguiente = siguiente;
    }

    public NodoDobleEntero getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoDobleEntero anterior) {
        this.anterior = anterior;
    }
}
