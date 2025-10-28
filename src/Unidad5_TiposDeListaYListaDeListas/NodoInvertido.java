package Unidad5_TiposDeListaYListaDeListas;

public class NodoInvertido {
    private NodoAlumno referencia;
    private NodoInvertido siguiente;

    public NodoInvertido(NodoAlumno referencia) {
        this.referencia = referencia;
        this.siguiente = null;
    }

    public NodoAlumno getReferencia() {
        return referencia;
    }

    public void setReferencia(NodoAlumno referencia) {
        this.referencia = referencia;
    }

    public NodoInvertido getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoInvertido siguiente) {
        this.siguiente = siguiente;
    }
}
