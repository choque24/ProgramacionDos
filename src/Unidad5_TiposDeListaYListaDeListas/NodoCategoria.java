package Unidad5_TiposDeListaYListaDeListas;

public class NodoCategoria {
    private char categoria;
    private NodoEmpleado inicioEmpleado ;
    private NodoCategoria siguiente;

    public NodoCategoria(char categoria){
        this.categoria = categoria;
        this.inicioEmpleado = null;
        this.siguiente = null;
    }

    public char getCategoria() {
        return categoria;
    }

    public void setCategoria(char categoria) {
        this.categoria = categoria;
    }

    public NodoEmpleado getInicioEmpleado() {
        return inicioEmpleado;
    }

    public void setInicioEmpleado(NodoEmpleado inicioEmpleado) {
        this.inicioEmpleado = inicioEmpleado;
    }

    public NodoCategoria getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoCategoria siguiente) {
        this.siguiente = siguiente;
    }
}
