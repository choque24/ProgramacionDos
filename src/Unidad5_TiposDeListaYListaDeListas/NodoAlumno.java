package Unidad5_TiposDeListaYListaDeListas;

public class NodoAlumno {
    private Alumno alumno;
    private NodoAlumno siguiente;

    public NodoAlumno(Alumno alumno) {
        this.alumno = alumno;
        this.siguiente = null;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public NodoAlumno getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoAlumno siguiente) {
        this.siguiente = siguiente;
    }
}
