package ParcialesYFinales.FinalAbril2025;

public class NodoArbol {
    private int dato;
    private NodoArbol menores;
    private NodoArbol mayores;
    private NodoArbol siguiente;
    private NodoArbol anterior;

    public NodoArbol(int dato) {
        this.dato = dato;
        menores = null;
        mayores = null;
        siguiente = null;
        anterior = null;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public NodoArbol getMenores() {
        return menores;
    }

    public void setMenores(NodoArbol menores) {
        this.menores = menores;
    }

    public NodoArbol getMayores() {
        return mayores;
    }

    public void setMayores(NodoArbol mayores) {
        this.mayores = mayores;
    }

    public NodoArbol getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoArbol siguiente) {
        this.siguiente = siguiente;
    }

    public NodoArbol getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoArbol anterior) {
        this.anterior = anterior;
    }
}
