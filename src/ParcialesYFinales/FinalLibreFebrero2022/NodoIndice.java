package ParcialesYFinales.FinalLibreFebrero2022;

public class NodoIndice {
    private NodoArbol indice;
    private NodoIndice siguiente;

    public NodoIndice(NodoArbol indice) {
        this.indice = indice;
        siguiente = null;
    }

    public NodoArbol getIndice() {
        return indice;
    }

    public void setIndice(NodoArbol indice) {
        this.indice = indice;
    }

    public NodoIndice getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoIndice siguiente) {
        this.siguiente = siguiente;
    }
}
