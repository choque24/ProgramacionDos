package Unidad6_Arboles;

public class NodoArbol {
    int valor;
    NodoArbol menores;
    NodoArbol mayores;

    public NodoArbol(int valor) {
        this.valor = valor;
        menores = null;
        mayores = null;
    }

    public int getValor() {
        return valor;
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
}
