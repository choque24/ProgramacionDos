package ParcialesYFinales.FinalLibreFebrero2022;

public class NodoArbol {
    private int numeroCliente;
    private int dni;
    private NodoArbol mayores;
    private NodoArbol menores;

    public NodoArbol(int numeroCliente, int posicionArchivo) {
        this.numeroCliente = numeroCliente;
        this.dni = posicionArchivo;
        mayores = null;
        menores = null;
    }

    public NodoArbol getMayores() {
        return mayores;
    }

    public void setMayores(NodoArbol mayores) {
        this.mayores = mayores;
    }

    public NodoArbol getMenores() {
        return menores;
    }

    public void setMenores(NodoArbol menores) {
        this.menores = menores;
    }

    public int getNumeroCliente() {
        return numeroCliente;
    }

    public void setNumeroCliente(int numeroCliente) {
        this.numeroCliente = numeroCliente;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }
}
