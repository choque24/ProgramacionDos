package ParcialesYFinales.RecuperatorioNoviembre2024;

public class NodoLista {
    private int categoria;
    private NodoLista siguiente;
    private NodoLista anterior;

    public NodoLista(int categoria) {
        this.categoria = categoria;
        siguiente = null;
        anterior = null;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public NodoLista getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoLista siguiente) {
        this.siguiente = siguiente;
    }

    public NodoLista getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoLista anterior) {
        this.anterior = anterior;
    }
}
