package Unidad3_ListasSimples;

public class Nodo {
    private int dato;
    private Nodo siguiente; //Referencia al Siguiente Nodo

//    Constructor de la clase
    public Nodo(int dato) {
        this.dato = dato;
        this.siguiente = null;
    }

    public int getDato() {
        return dato;
    }
    public void setDato(int dato) {
        this.dato = dato;
    }
    public Nodo getSiguiente() {
        return siguiente;
    }
    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

}
