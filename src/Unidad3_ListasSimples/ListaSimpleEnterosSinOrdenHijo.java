package Unidad3_ListasSimples;

public class ListaSimpleEnterosSinOrdenHijo extends ListaSimpleEnteros {
    public ListaSimpleEnterosSinOrdenHijo() {
        super();
    }

    public void insertarAlPrincipio(int dato) {
        Nodo nodo = new Nodo(dato);
        nodo.setSiguiente(primero);
        setPrimero(nodo);
    }

    public void insertarAlFinal(int dato) {
        Nodo nodo = new Nodo(dato);
        Nodo actual = primero;

        if (actual == null) {
            setPrimero(nodo);
            return;
        }

        while (actual.getSiguiente() != null) {
            actual = actual.getSiguiente();
        }
        actual.setSiguiente(nodo);
    }

    //Eliminacion
    public void borrarElemento(int dato) {
        Nodo actual = primero;
        Nodo anterior = null;

        //Recorro la lista hasta encontrar el dato
        while (actual != null && dato != actual.getDato()) {
            anterior = actual;
            actual = actual.getSiguiente();
        }

        /// No se elimina ningun nodo(Lista vacia o sin el elemento)
        if (actual == null) {
            System.out.println("No se encontro el elemento");
            return;
        }

        if (anterior == null) {
            /// El nodo esta en el principio
            setPrimero(primero.getSiguiente());
        } else {
            /// El nodo a borrar esta en la mitad o el final
            anterior.setSiguiente(actual.getSiguiente());
        }
    }
    //    Retornar el mínimo nodo de la  lista.
    public Nodo getNodoMinimo() {
        Nodo nodoActual = primero;
        Nodo nodoMinimo = null;
        int valorMinimo = 0;

        if (nodoActual == null) {
            return null;
        }

        nodoMinimo = nodoActual;
        valorMinimo = nodoActual.getDato();

        while (nodoActual != null) {
            if (nodoActual.getDato() < valorMinimo) {
                nodoMinimo = nodoActual;
                valorMinimo = nodoActual.getDato();
            }
            nodoActual = nodoActual.getSiguiente();
        }
        return nodoMinimo;
    }

    public Nodo getNodoMinimoRecursivo(){
        return getNodoMinimoRecursivoPrivado(primero, primero, 0);
    }

    private Nodo getNodoMinimoRecursivoPrivado(Nodo actual, Nodo nodoMinimo, int minimo) {
        if (actual == null) {
            return nodoMinimo;
        }

        if(actual.getDato() < minimo) {
            minimo = actual.getDato();
            nodoMinimo = actual;
        }

        return getNodoMinimoRecursivoPrivado(actual.getSiguiente(), nodoMinimo, minimo);
    }

}
