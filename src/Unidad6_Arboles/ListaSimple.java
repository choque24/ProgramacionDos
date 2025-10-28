package Unidad6_Arboles;

public class ListaSimple {
    private NodoLista raiz;

    public ListaSimple() {
        this.raiz = null;
    }

    public void insertar(int dato) {
        NodoLista nuevo = new NodoLista(dato);

        if(raiz == null) {
            raiz = nuevo;
            return;
        }

        NodoLista actual = raiz;

        while(actual.getSiguiente() != null) {
            actual = actual.getSiguiente();
        }

        nuevo.setSiguiente(actual.getSiguiente());
        actual.setSiguiente(nuevo);
    }

    public void mostrarLista() {
        NodoLista actual = raiz;

        while(actual != null) {
            System.out.print(actual.getDato() + " ");
            actual = actual.getSiguiente();
        }

        System.out.println(" ");
    }

    public void intoLista(Arbol arbol){
        intoListaRecursivo(arbol, raiz);
    }

    private void intoListaRecursivo(Arbol arbol, NodoLista nodo) {
        int cantidad = getCantidadElementos();
    }

    public int getCantidadElementos() {
        NodoLista actual = raiz;
        int cantidad = 0;
        while (actual != null) {
            cantidad++;
            actual = actual.getSiguiente();
        }
        return cantidad;
    }


    public NodoLista getRaiz() {
        return raiz;
    }

    public void setRaiz(NodoLista raiz) {
        this.raiz = raiz;
    }
}
