package ParcialesYFinales.FinalLibreFebrero2022;

public class ListaCircular {
    private NodoIndice primero;

    public ListaCircular() {
        primero = null;
    }

    public void insertar(NodoArbol nodo) {
        if (primero == null) {
            primero = new NodoIndice(nodo);
            return;
        }

        NodoIndice actual = primero;
        NodoIndice nuevo = new NodoIndice(nodo);

        if (nodo.getDni() < actual.getIndice().getDni()) {
            nuevo.setSiguiente(primero);
            while (actual != primero) {
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(nuevo);
            primero = nuevo;
        } else{
            while(actual != primero && actual.getIndice().getDni() < nodo.getDni()) {
                actual = actual.getSiguiente();
            }
            nuevo.setSiguiente(actual.getSiguiente());
            actual.setSiguiente(nuevo);
        }
    }

    public NodoIndice getPrimero() {
        return primero;
    }

    public void setPrimero(NodoIndice primero) {
        this.primero = primero;
    }
}
