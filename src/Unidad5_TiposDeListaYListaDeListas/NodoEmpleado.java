package Unidad5_TiposDeListaYListaDeListas;

public class NodoEmpleado {
    private Empleado empleado;
    private NodoEmpleado siguiente;

    public NodoEmpleado(){
        this.empleado = null;
        this.siguiente = null;
    }



    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public NodoEmpleado getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoEmpleado siguiente) {
        this.siguiente = siguiente;
    }
}
