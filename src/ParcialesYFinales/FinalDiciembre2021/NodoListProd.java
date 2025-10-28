package ParcialesYFinales.FinalDiciembre2021;

//Cada nodo de LISTPROD tiene
//id_producto de tipo entero, un puntero al siguiente para enlazar la lista LISTPROD, y un
//puntero a un árbol asociado a ese producto que contiene información sobre las ventas del
//mismo.

public class NodoListProd {
    private int idProducto;
    private NodoArbol primeroArbol;
    private NodoListProd siguiente;

    public NodoListProd(int idProducto) {
        this.idProducto = idProducto;
        primeroArbol = null;
        siguiente = null;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public NodoArbol getPrimeroArbol() {
        return primeroArbol;
    }

    public void setPrimeroArbol(NodoArbol primeroArbol) {
        this.primeroArbol = primeroArbol;
    }

    public NodoListProd getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoListProd siguiente) {
        this.siguiente = siguiente;
    }
}
