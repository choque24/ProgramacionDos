package ParcialesYFinales.FinalDiciembre2021;
//Así cada nodo de árbol tiene anio de tipo entero, una cantidad de ventas de tipo
//entero, y los respectivos punteros que permiten mantener la estructura de árbol.
public class NodoArbol {
    private int anio;
    private int cantidadVentas;
    private NodoArbol menores;
    private NodoArbol mayores;

    public NodoArbol(int anio, int cantidadVentas) {
        this.anio = anio;
        this.cantidadVentas = cantidadVentas;
        menores = null;
        mayores = null;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getCantidadVentas() {
        return cantidadVentas;
    }

    public void setCantidadVentas(int cantidadVentas) {
        this.cantidadVentas = cantidadVentas;
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
