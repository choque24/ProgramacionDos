package Unidad5_TiposDeListaYListaDeListas;

public class NodoEntero {
    private int dato;
    private NodoEntero siguiente;

    public NodoEntero(int dato) {
        this.dato = dato;
        siguiente = null;
    }

    public int getDato() {
        return dato;
    }
    public void setDato(int dato) {
        this.dato = dato;
    }

    public NodoEntero getSiguiente() {
        return siguiente;
    }
    public void setSiguiente(NodoEntero siguiente) {
        this.siguiente = siguiente;
    }

}
